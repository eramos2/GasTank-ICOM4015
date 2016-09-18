import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * The DashFrame class implements the method that the main class will call.
 * @author Emmanuel Ramos
 *
 */
public class DashFrame extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	JFrame frame;
	DashPanel dashPanel; 
	/**
	 * Here the frame is created and the panel is added, and updated accordingly.
	 */
	public void fire(){
		frame = new JFrame("Dash Panel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		dashPanel = new DashPanel();
		frame.add(dashPanel);
		frame.getContentPane().add(BorderLayout.CENTER, dashPanel);
		frame.setResizable(false);
		frame.setSize(1000, 500);
		System.out.println();
		frame.setLocation(10, 80);
		frame.setVisible(true);
		DashPanel.update(frame);
	}
}
