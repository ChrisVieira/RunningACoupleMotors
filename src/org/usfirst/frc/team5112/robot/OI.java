package org.usfirst.frc.team5112.robot;

import org.usfirst.frc.team5112.robot.commands.DecreaseMotorSpeed;
import org.usfirst.frc.team5112.robot.commands.IncreaseMotorSpeed;
import org.usfirst.frc.team5112.robot.commands.RunNegative;
import org.usfirst.frc.team5112.robot.commands.RunPositive;
import org.usfirst.frc.team5112.robot.commands.Stop;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class OI {
	
	public JoystickButton joystickButtonThree;
    public JoystickButton joystickButtonFour;
    public JoystickButton joystickButtonFive;
    public JoystickButton joystickButtonEleven;
    public JoystickButton joystickButtonTwelve;
       
	public static Joystick joystick;
	
	public OI(){
		joystick = new Joystick(0);
		
		joystickButtonThree = new JoystickButton(joystick, 3);
		joystickButtonThree.whenPressed(new Stop());
		joystickButtonFour = new JoystickButton(joystick, 4);
		joystickButtonFour.whenPressed(new RunPositive());
		joystickButtonFive = new JoystickButton(joystick, 5);
		joystickButtonFive.whenPressed(new RunNegative());
		joystickButtonEleven = new JoystickButton(joystick, 11);
		joystickButtonEleven.whenPressed(new IncreaseMotorSpeed());
		joystickButtonTwelve = new JoystickButton(joystick, 12);
		joystickButtonTwelve.whenPressed(new DecreaseMotorSpeed());
	
		SmartDashboard.putNumber("Motor Speed: ", Robot.MotorSet.motorSpeed);
	}
}
