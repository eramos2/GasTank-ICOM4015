import java.awt.Graphics;

/**
 * The SpeedController class paints the button that reduces or increases the rpm of the wheel.
 * @author Emmanuel Ramos
 *
 */

public class SpeedController extends Buttons{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//The RPL (revolutions per liter of gas) of the machine.
	public static int rpl = 3; //<-----CHANGE ME TO MAKE GAS BURN QUICKER OR SLOWER
	public static int rpm = 0; //The speed at which the wheel turns, RPM(revolutions per minute).
	/**
	 * Construct the speed controller object per the given values
	 * @param size the width and height
	 * @param xPos X coordinate
 	 * @param yPos Y coordinate
	 * @param nameX X coordinate of the name
	 * @param nameY Y coordinate of the name
	 * @param name the string
	 */
	public SpeedController(int size, int xPos, int yPos, int nameX, int nameY, String name) {
		super(size, xPos, yPos, nameX, nameY, name);
	}

	/**
	 * Paints the speed controller button box and text
	 */
	public void paintComponent(Graphics g){
		P2Utils.drawRect(getX(), getY(), getButtonSize(), getButtonSize(), g);
		P2Utils.drawText(getName(), getNameX(), getNameY(), g);
		P2Utils.drawText("Speed", getNameX()-15, getNameY()+15, g);
		P2Utils.drawText("SYSTEM CONTROLLER", 540, 370, g);
	}
}
