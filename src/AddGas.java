import java.awt.Color;
import java.awt.Graphics;

/**
 * The AddGas class paints the addGas button per the coordinates and size given.
 * 
 * @author Emmanuel Ramos
 *
 */

public class AddGas extends Buttons{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructs the addGas button (rectangle) and receives as parameters the size and coordinates, name values.
	 * @param size The width and height of the rectangle.
	 * @param xPos The X coordinate
	 * @param yPos The Y coordinate
	 * @param nameX The X coordinate of the name
	 * @param nameY The Y coordinate of the name
	 * @param name The string name 
	 */ 
	
	public AddGas(int size, int xPos, int yPos, int nameX, int nameY, String name) {
		super(size, xPos, yPos, nameX, nameY, name);
	}
	
	/**
	 * Paints the box and the String 
	 */
	public void paintComponent(Graphics g){
		g.setColor(Color.RED);
		P2Utils.fillRect(getX(), getY(), getButtonSize(), getButtonSize(), g);
		g.setColor(Color.BLACK);
		P2Utils.drawText(getName(), getNameX(), getNameY(), g);



	}

}
