import java.awt.Graphics;
import javax.swing.JPanel;



/**
 * The Wheel class paints and rotates the wheel.
 * @author Emmanuel Ramos
 *
 */
public class Wheel extends JPanel {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 //Dimensions of wheel enclosing circle
	private int wheelX, wheelY, wheelR;
		
	//Arc Angle dimensions of dashed marks inside speed meter 
	private int arcAngleW; 
	
	public static int  omega, angInc;
	public static int fpsAvg =16;
	private int textX, textY;
	/**
	 * Constructs a wheel per the specified values.
	 */
	public Wheel(){
		wheelX = 500;
		wheelY = 125;
		wheelR = 100;
		arcAngleW = 2;
		textX = 725;
		textY = 200;
		Wheel.fpsAvg = 16;
	}
	/**
	 * rotates the wheel around the circle
	 */
	public static void rotateWheel(){
		if(SpeedController.rpm!=0){
			Wheel.omega = (int)((180/Math.PI)*(2*Math.PI*(60000/15)));
			Wheel.angInc = (int)(Wheel.omega/Wheel.fpsAvg);
			DashPanel.marksStartAngle -= 1;
			if(SpeedController.rpm == 0){
				DashPanel.marksStartAngle = 0;
			}
		}
	}
	/**
	 * Paints the wheel
	 */
	public void paintComponent(Graphics g){
		//Draws circle
		P2Utils.drawCircle(wheelX, wheelY, wheelR, g); 
		//draws the marks that rotate around the wheel
		P2Utils.drawMarks(wheelX, wheelY, wheelR, DashPanel.marksStartAngle + 0,   arcAngleW, g);
		P2Utils.drawMarks(wheelX, wheelY, wheelR, DashPanel.marksStartAngle + 45,  arcAngleW, g);
		P2Utils.drawMarks(wheelX, wheelY, wheelR, DashPanel.marksStartAngle + 90,  arcAngleW, g);
		P2Utils.drawMarks(wheelX, wheelY, wheelR, DashPanel.marksStartAngle + 135, arcAngleW, g);
		P2Utils.drawMarks(wheelX, wheelY, wheelR, DashPanel.marksStartAngle + 180, arcAngleW, g);
		P2Utils.drawMarks(wheelX, wheelY, wheelR, DashPanel.marksStartAngle + 225, arcAngleW, g);
		P2Utils.drawMarks(wheelX, wheelY, wheelR, DashPanel.marksStartAngle + 270, arcAngleW, g);
		P2Utils.drawMarks(wheelX, wheelY, wheelR, DashPanel.marksStartAngle + 315, arcAngleW, g);
		//Wheel Ball
		P2Utils.fillCircle((600 + (int)(100 * Math.cos(-DashPanel.marksStartAngle*Math.PI/180))) -25, (225 + (int)(100*Math.sin(-DashPanel.marksStartAngle*(Math.PI/180)))-25), wheelR/4, g);
		//draws Text
		P2Utils.displayVerticalText("WHEEL", textX, textY, g);
		
	}
}
