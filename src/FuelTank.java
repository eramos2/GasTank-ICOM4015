import java.awt.Color;
import java.awt.Graphics;

/**
 * The Fuel Tank class paints and has methods add gas to the tank.
 * @author Emmanuel Ramos
 *
 */

public class FuelTank extends MeterComponent {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//Dimensions of Fuel Tank enclosing rectangle
	private int tankX, tankY, tankH, tankW;
	
	//Dimensions of fuel remaining 
	private int fuelX, fuelY, fuelH, fuelW;
	
	static public int availableFuel = 350; //The amount in liters available in the tank.
	
	/**
	 * Constructs the object per the specified coordinates and size.
	 * @param maxValue The maximum amount of gas that the fuel tank can store.
	 */
	public FuelTank(int maxValue){
		super(maxValue);
		tankX = 850;
		tankY = 75;
		tankW = 100;
		tankH = maxValue;
		fuelX = tankX;
		fuelY = tankY+(tankH/4);
		fuelW = tankW;
		availableFuel = 0;
	}
	
	/**
	 * Paints the holding tank and the amount of gas in the tank, and the string name.
	 */
	public void paintComponent(Graphics g){
		
		if(DashPanel.currentValue!=0){
			fuelY = tankY + (tankH - DashPanel.currentValue);
		}
		if(DashPanel.currentValue==0){
			fuelY = tankY + tankH;
		}
		fuelH = (tankY + tankH) - fuelY;
		Color lightRed = new Color(245, 105, 145); //Light Red gasoline color
		g.setColor(lightRed);
		g.fillRect(fuelX, fuelY, fuelW, fuelH);
		g.setColor(Color.BLACK);
		g.drawRect(tankX, tankY, tankW, tankH);
		P2Utils.displayVerticalText("FUEL TANK", 960, 180, g);
	}
	
	/**
	 * Adds Gas to the tank.
	 */
	public static void addGas(){
		if(DashPanel.currentValue>DashPanel.maxValue-50){
			DashPanel.currentValue = DashPanel.maxValue;
		}
		if(DashPanel.currentValue <=(DashPanel.maxValue-50)){
			DashPanel.currentValue += 50; //<-----CHANGE ME FOR THE AMOUNT OF GAS TO BE ADDED BY CLICK
		}
	}
}
