import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * The class Revolutions Counter paints the revolutions counter
 * @author Emmanuel Ramos
 *
 */
public class RevolutionsCounter extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String[] revolutionsStringArray = {"0", "0", "0", "0", "0", "0", "0"}; //Initial starting revolutions

	private int counterX, counterY, counterW, counterH, textX, textY; //Size and Coordinates
	
	private String revolutionsString;
	
	/**
	 * Constructs the revolutions counter per the specified coordinates, size.
	 */
	public RevolutionsCounter(){
		counterX = 225;
		counterY= 25;
		counterW = 350;
		counterH = 50;
		textX = 340;
		textY = 100;
		revolutionsString = DashPanel.revCounterOriginal+"";
	}
	/**
	 * Sets the array that has the string of the original counter to the new value of the string counter
	 */
	public void setRevolutionsString(){
		for(int i=0; i<revolutionsString.length();i++){
			revolutionsStringArray[revolutionsStringArray.length-(revolutionsString.length()-i)] = revolutionsString.charAt(i)+"";
		}
	}
	/**
	 * Draws the string 
	 * @param g the graphics
	 */
	public void drawRevolutionsString(Graphics g){
		setRevolutionsString();
		for(int i=0; i<revolutionsStringArray.length; i++){
			P2Utils.drawText(revolutionsStringArray[i], (counterW-100)+(50*i), counterH+10, g);
		}
	}
	/**
	 * Paints the revolution counter and the string representation of the counter
	 */
	public void paintComponent(Graphics g){
		
		P2Utils.drawRect(counterX, counterY, counterW, counterH, g); // Revolutions Counter Box
		P2Utils.drawText("Revolutions Counter", textX, textY, g); //Revolutions Counter Text
		
		//Revolutions Counter Lines Dividers
		P2Utils.drawLine(275, 25, 275, 75, g);
		P2Utils.drawLine(325, 25, 325, 75, g);
		P2Utils.drawLine(375, 25, 375, 75, g);
		P2Utils.drawLine(425, 25, 425, 75, g);
		P2Utils.drawLine(475, 25, 475, 75, g);
		P2Utils.drawLine(525, 25, 525, 75, g);
		drawRevolutionsString(g);
	}
}
