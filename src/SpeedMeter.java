import java.awt.Graphics;


/**
 * The speed meter class paints the speed meter.
 * @author Emmanuel Ramos
 *
 */
public class SpeedMeter extends MeterComponent {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//Dimensions of speed meter enclosing circle
	private int speedMeterX, speedMeterY, speedMeterR, speedMeterArcAngle;
	
	//Arc Angle dimensions of dashed marks inside speed meter 
	private int marksR, arcAngleW; 
	
	private int textX, textY;
	
	/**
	 * Construct the speed meter per the specified values
	 * @param maxValue maximum amount of gas the tank can have.
	 */
	public SpeedMeter(int maxValue){
		super(maxValue);
		speedMeterX = 100;
		speedMeterY = 125;
		speedMeterR = 100;
		speedMeterArcAngle = 360;
		arcAngleW = 5;
		marksR = speedMeterR/4; 
		textX = 80;
		textY = 120;
	}
	/**
	 * Paints the speed meter
	 */
	@Override
	public void paintComponent(Graphics g){

		P2Utils.drawCircle(speedMeterX, speedMeterY, speedMeterR, g); //Draws circle

		P2Utils.displayVerticalText("SPEEDOMETER", textX, textY, g); //draws Text
		
		//SpeedOmeter Speed Value Text
		P2Utils.drawText("RPM", speedMeterX*1.9, speedMeterY*2.4,  g);
		P2Utils.drawText("0",   speedMeterX*1.5, speedMeterY*2.24, g);
		P2Utils.drawText("10",  speedMeterX*1.2, speedMeterY*1.84, g);
		P2Utils.drawText("20",  speedMeterX*1.5, speedMeterY*1.4,  g);
		P2Utils.drawText("30",  speedMeterX*1.9, speedMeterY*1.28, g);
		P2Utils.drawText("40",  speedMeterX*2.4, speedMeterY*1.4,  g);
		P2Utils.drawText("50",  speedMeterX*2.6, speedMeterY*1.84, g);
		P2Utils.drawText("60",  speedMeterX*2.4, speedMeterY*2.24, g);
	
		P2Utils.drawMarks(speedMeterX*2.5,  speedMeterY*1.6,  marksR, speedMeterArcAngle,                arcAngleW, g); //Right Center
		P2Utils.drawMarks(speedMeterX*2.25, speedMeterY*1.16, marksR, (int)(speedMeterArcAngle*(0.125)), arcAngleW, g);
		P2Utils.drawMarks(speedMeterX*1.75, speedMeterY,      marksR, (int)(speedMeterArcAngle*(0.25)),  arcAngleW, g); // Top Center
		P2Utils.drawMarks(speedMeterX*1.25, speedMeterY*1.16, marksR, (int)(speedMeterArcAngle*(0.375)), arcAngleW, g);
		P2Utils.drawMarks(speedMeterX,      speedMeterY*1.6,  marksR, (int)(speedMeterArcAngle*(0.5)),   arcAngleW, g); //Left Center
		P2Utils.drawMarks(speedMeterX*1.25, speedMeterY*2.04, marksR, (int)(speedMeterArcAngle*(0.625)), arcAngleW, g);
		P2Utils.drawMarks(speedMeterX*1.75, speedMeterY*2.2,  marksR, (int)(speedMeterArcAngle*(0.75)),  arcAngleW, g); //Bottom Center
		P2Utils.drawMarks(speedMeterX*2.25, speedMeterY*2.04, marksR, (int)(speedMeterArcAngle*(0.875)), arcAngleW, g);
	}

}
