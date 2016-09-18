import java.awt.Color;
import java.awt.Graphics;

/**
 * The Fuel Meter class construct and paints the fuel meter per the given coordinates, size and current gas available.
 * @author Emmanuel Ramos
 *
 */
public class FuelMeter extends MeterComponent{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//Dimensions of meter bar enclosing rectangle
	private int borderX, borderY, borderH, borderW;
	
	//Dimensions of meter bar
	private int barX, barY, barH, barW;
	
	//Dimensions of line dividers
	private int dividerX, dividerY, dividerW, dividerH, lineX, lineY;
	
	/**
	 * Constructs the fuel meter per the specified values for coordinates and size
	 * @param maxValue the maximum amount of gas the tank can have.
	 */
	public FuelMeter(int maxValue){
		super(maxValue);
		borderX = 100;
		borderY = 375;
		borderW = 200;
		borderH = 50;
		barX = borderX;
		barY = borderY+(borderH/4);
		barH = borderH/2;
		barW = 200;
		dividerX = borderX +50;
		dividerY = borderY + 10;
		dividerW = 2;
		dividerH = 30;
		lineX = borderX;
		lineY = 390;
	}
	/**
	 * Paints the speed meter by the given coordinates and sizes.
	 */
	public void paintComponent(Graphics g){
		double w = ((double)DashPanel.currentValue/(double)350);
		barW = (int)((double)200*(double)w);
		P2Utils.drawRect(borderX, borderY, borderW, borderH, g);
		g.setColor(Color.GRAY);
		P2Utils.fillRect(barX, barY, barW, barH, g);
		g.setColor(Color.BLACK);
		
		//Bold Fuel Meter Lines Dividers
		for(int i=0; i<3;i++){
			P2Utils.fillRect(dividerX +(i*50), dividerY, dividerW, dividerH, g);
		}
		
		//In Line Dividers
		for(int i=1; i<20;i++){
			if(!((i == 5) || (i == 10) || (i== 15) || (i == 20))){
				P2Utils.drawLine(lineX+(10*i), lineY, lineX+(10*i), lineY+20, g);
			}
		}
		//Draws the text
		P2Utils.drawText("E", 110, 440, g);
		P2Utils.drawText("F", 290, 440, g);
		P2Utils.drawText("Fuel Meter", 170, 440, g);

	}	
}
