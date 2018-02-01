package org.usfirst.frc.team5112.robot;

import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.VictorSP;

public class RobotMap {

	public static VictorSP motor1;
	public static VictorSP motor2;

	public static PowerDistributionPanel pdp;
	
	  public static void init() {
		  motor1 = new VictorSP(8);
		  motor2 = new VictorSP(9);
		  
//		  pdp = new PowerDistributionPanel();
	  }
}
