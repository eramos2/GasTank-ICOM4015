import javax.swing.JPanel;


/**
 * The Buttons class constructs the buttons, and has all methods to access the values of all its variables.
 * @author Emmanuel Ramos
 *
 */
public abstract class Buttons extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int buttonX, buttonY, buttonSize, nameX, nameY;
	private String name;
	
	/**
	 * Construct button per given parameters.
	 * @param size The height and width of the button.
	 * @param xPos the X coordinate of the button
	 * @param yPos the Y coordinate of the button
	 * @param nameX the X coordinate of the name
	 * @param nameY the Y coordinate of the name
	 * @param name the string name
	 */
	public Buttons(int size, int xPos, int yPos, int nameX, int nameY, String name){
		this.buttonSize = size;
		this.buttonX = xPos;
		this.buttonY = yPos;
		this.nameX = nameX;
		this.nameY = nameY;
		this.name = name;
	}
	
	
	/**
	 * @return the X coordinate of the button
	 */
	public int getX(){
		return buttonX;
	}
	
	/**
	 * @return the Y coordinate of the button
	 */
	public int getY(){
		return buttonY;
	}
	/** 
	 * @return the height and width of the button
	 */
	public int getButtonSize(){
		return buttonSize;
	}
	/**
	 * @return the name of the button
	 */
	public String getName(){
		return this.name;
	}
	/**
	 * 
	 * @return the X coordinate of the name
	 */
	public int getNameX(){
		return nameX;
	}
	/** 
	 * 
	 * @return the Y coordinate of the name
	 */
	public int getNameY(){
		return nameY;
	}
	/**
	 * Sets the X coordinate to the param given
	 * @param x the new X coordinate of the button
	 */
	public void setX(int x){
		buttonX = x;
	}
	/**
	 * Sets the Y coordinate to the param given
	 * @param y the new Y coordinate of the button
	 */
	public void setY(int y){
		buttonY = y;
	}
	

	/**
	 * Sets the height and width of the button to  the param given
	 * @param size the new width and height of the button
	 */
	public void setButtonSize(int size){
		this.buttonSize = size;
	}
	/**
	 * Sets the name X coordinate of the button to  the param given
	 * @param size the new name X coordinate
	 */
	public void setNameX(int x){
		this.nameX = x;
	}
	/**
	 * Sets the name Y coordinate of the button to  the param given
	 * @param size the new name Y coordinate
	 */
	public void setNameY(int y){
		this.nameY = y;
	}

}
