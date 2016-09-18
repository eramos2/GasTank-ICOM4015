import java.awt.Graphics;

/**
 * Turning Arm class for the arm of the inside the speed meter. Paints it and moves it.
 * @author Emmanuel Ramos
 *
 */
public class TurningArm extends MeterComponent{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Dimensions of turningArm bar
	private int armX, armY, startingAngle, armW, armR; //maxAngle;
	public static int armAngle;
	/**
	 * Set all coordinates and angle for the turning arm initial position.
	 * @param max value maximum value for gas on the fuel tank.
	 */
	public TurningArm(int maxValue) {
		super(maxValue);
		armX = 100;
		armY = 125;
		armR = 100;
		startingAngle = 225;
		armW = 4;
		armAngle = startingAngle;
	}
	
	/**
	 * Sets the angle at witch the arm should be with respect to the speed meter rpm.
	 */
	public static void setArmAngle(){
		DashPanel.armAngle = 225 - (int)(SpeedController.rpm*4.5);
	}

	/**
	 * Paints the turning arm to the specified coordinates and size.
	 */
	public void paintComponent(Graphics g){
		P2Utils.drawMarks(armX, armY, armR, DashPanel.armAngle, armW, g);
	}

}
