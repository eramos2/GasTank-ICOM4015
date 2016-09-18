import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * The P2Utils class contains all methods pertinent to the graphics painting.
 * @author emmanuelramos
 *
 */
public class P2Utils extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Paint a vertical text
	 * @param text the string 
	 * @param xPos X coordinate of the string
	 * @param yPos Y coordinate of the string
	 * @param g the graphics to use
	 */
	public static void displayVerticalText(String text, int xPos, int yPos, Graphics g){
		String[] textArray = new String[text.length()];
		for(int i=0; i<text.length(); i++){
			textArray[i] = ""+text.charAt(i);
		}
		for(int i=0; i<textArray.length; i++){
			g.drawString(textArray[i], xPos, yPos);
			yPos+=20;
		}	
	}
	
	/**
	 * Draws the small dashes around the circle
	 * @param xPos X coordinate 
	 * @param yPos Y coordinate
	 * @param radius radius 
	 * @param startAngle the starting angle
	 * @param width the width
	 * @param g the graphics
	 */
	public static void drawMarks(double xPos, double yPos, double radius, double startAngle, double width, Graphics g){
		g.fillArc((int)xPos, (int)yPos, (int)(radius*2), (int)(radius*2), (int)startAngle, (int)width);
	}
	
	/**
	 * Draws a circle 
	 * @param xPos X coordinate
	 * @param yPos Y coordinate
	 * @param radius the radius
	 * @param g the graphics
	 */
	public static void drawCircle(double xPos, double yPos, double radius, Graphics g){
		g.drawArc((int)xPos, (int)yPos, (int)(radius*2), (int)(radius*2), 0, 360);
	}
	/**
	 * Draws a filled circle
	 * @param xPos X coordinate
	 * @param yPos Y coordinate
	 * @param radius the radius
	 * @param g the graphics
	 */
	public static void fillCircle(double xPos, double yPos, double radius, Graphics g){
		g.fillArc((int)xPos, (int)yPos, (int)(radius*2), (int)(radius*2), 0, 360);
	}
	/**
	 * Draws a String
	 * @param text the string
	 * @param xPos X coordinate
	 * @param yPos Y coordinate
	 * @param g the graphics 
	 */
	public static void drawText(String text, double xPos, double yPos, Graphics g){
		g.drawString(text, (int)xPos, (int)yPos);
	}
	/**
	 * draws a Rectangle 
	 * @param xPos X coordinate
	 * @param yPos Y coordinate
	 * @param width the width 
	 * @param heigth the height
	 * @param g the graphics
	 */
	public static void drawRect(double xPos, double yPos, double width, double heigth, Graphics g){
		g.drawRect((int)xPos, (int)yPos, (int)width, (int)heigth);
	}
	/**
	 * draws a filled rectangle 
	 * @param xPos X coordinate
	 * @param yPos Y coordinate
	 * @param width the width
	 * @param heigth the height
	 * @param g the graphics
	 */ 
	public static void fillRect(double xPos, double yPos, double width, double heigth, Graphics g){
		g.fillRect((int)xPos, (int)yPos, (int)width, (int)heigth);
	}
	/**
	 * Draws a  line 
	 * @param xPos1 X1 coordinate 
	 * @param yPos1 Y1 coordinate
	 * @param xPos2 X2 coordinate
	 * @param yPos2 Y2 coordinate
	 * @param g the graphics
	 */ 
	public static void drawLine(int xPos1, int yPos1, int xPos2, int yPos2, Graphics g){
		g.drawLine(xPos1, yPos1, xPos2, yPos2);
	}
}
