import javax.swing.JPanel;

/**
 * Sets the premise for all the meters in the program.
 * @author Emmanuel Ramos
 *
 */
public abstract class MeterComponent extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static int maxValue =350;
	public static int currentValue =20;
	
	/**
	 * Construct the meter component sets variables to the given param
	 * @param maxValue the maximum amount of gas the tank can have.
	 */
	public MeterComponent(int maxValue){
		MeterComponent.maxValue = maxValue;
		MeterComponent.currentValue = 20;
	}
}
