import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * The Click Listener class construct a listener to set the X and Y coord of the click.
 * @author Emmanuel Ramos
 *
 */
public class ClickListener implements MouseListener{

	//Coordinates of the click
	public static int xPos, yPos;
	
	/**
	 * Sets the X and Y coordinates to the ones of the click.
	 */
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		xPos = arg0.getX();
		yPos = arg0.getY();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
