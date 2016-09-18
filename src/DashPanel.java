import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * DashPanel class, where all the objects to be painted are called.
 * @author Emmanuel Ramos
 *
 */
public class DashPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	public static int xPos = 0;
	public static int yPos = 0;
	public static int armAngle = 225;
	public static int marksStartAngle = 0;
	public static int speedControl = 50;
	public static boolean mouseClick = false;
	public static int maxValue = 350;
	public static int currentValue = 0;
	public static int revCounter1 = 0; //The amount of wheel revolutions until now + 1.
	public static int revCounterOriginal; //The actual amounts of rotations until now 
	public static boolean fullRotation = false;
	JFrame frame;
	SpeedMeter speedMeter;
	public static Wheel wheel;
	RevolutionsCounter revCounter;
	SpeedController speedPlus;
	SpeedController speedMinus;
	FuelMeter fuelMeter;
	FuelTank fuelTank;
	AddGas addGas;
	TurningArm turningArm;
	public static ClickListener clickListener = new ClickListener();
	
	
	/**
	 * Paints all of the objects that that the frame will contain.
	 */
	public void paintComponent(Graphics g){
		speedMeter = new SpeedMeter(0);
		wheel = new Wheel();
		revCounter = new RevolutionsCounter();
		fuelMeter = new FuelMeter(0);
		fuelTank = new FuelTank(350);
		speedMinus = new SpeedController(50, 500, 375, 520, 400, "-");
		speedPlus = new SpeedController(50, 650, 375, 670, 400, "+");
		addGas = new AddGas(50, 375, 225, 350, 290, "Press to Add Gas");
		turningArm = new TurningArm(0);
		speedMeter.paintComponent(g);
		wheel.paintComponent(g);
		revCounter.paintComponent(g);
		fuelMeter.paintComponent(g);
		fuelTank.paintComponent(g);
		speedMinus.paintComponent(g);
		speedPlus.paintComponent(g);
		addGas.paintComponent(g);
		turningArm.paintComponent(g);
	}

	/**
	 * The update method for repainting the panel.
	 * @param frame the frame to witch it will repaint.
	 */
	public static void update(JFrame frame){
		frame.addMouseListener(clickListener);
		
		while(true){
			//When the add Gas button is pressed
			if(ClickListener.xPos>=375 && ClickListener.xPos<=425 && ClickListener.yPos>=225 && ClickListener.yPos<=275){
				FuelTank.addGas();
				frame.repaint();
				ClickListener.xPos = 0;
				ClickListener.yPos =0;
			}
			if(DashPanel.currentValue!=0){
				//When the less speed button is pressed	
				if(ClickListener.xPos>=500 && ClickListener.xPos<=550 && ClickListener.yPos>=375 && ClickListener.yPos<=425 && SpeedController.rpm !=0){ 
					ClickListener.xPos = 0;
					ClickListener.xPos= 0;
					SpeedController.rpm-=1; 
					TurningArm.setArmAngle();

				}
				//When the more speed button is clicked
				if(ClickListener.xPos>=650 && ClickListener.xPos<=700 && ClickListener.yPos>=375 && ClickListener.yPos<=425 && SpeedController.rpm !=60){
					ClickListener.xPos = 0;
					ClickListener.xPos= 0;
					SpeedController.rpm +=1;
					TurningArm.setArmAngle();
				}
					TurningArm.setArmAngle();
			
					if(SpeedController.rpm!=0){
						speedControl = (int)(((60/SpeedController.rpm)*1000)/360);
					}
					//Adds a revolution to the revCounter
					if(((600 + (int)(100 * Math.cos(-DashPanel.marksStartAngle*Math.PI/180))) -25)==(600 + (int)(100 * Math.cos(0)) -25) && (225 + (int)(100*Math.sin(-DashPanel.marksStartAngle*(Math.PI/180)))-25) == (225 + (int)(100*Math.sin(0))-25) && SpeedController.rpm !=0){          
						DashPanel.revCounter1+=1;
						DashPanel.revCounterOriginal = DashPanel.revCounter1-1;
						fullRotation=true;
					}
					//Diminishes the amount of gas 
					if(DashPanel.revCounterOriginal % SpeedController.rpl ==0 && DashPanel.fullRotation && DashPanel.revCounterOriginal!=0){
						DashPanel.currentValue-=10;
						DashPanel.fullRotation = false;
					}
					Wheel.rotateWheel(); 
			}
			
			frame.repaint();
			try {
				Thread.sleep(speedControl);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
