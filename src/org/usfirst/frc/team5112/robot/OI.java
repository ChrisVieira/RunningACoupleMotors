package org.usfirst.frc.team5112.robot;

import org.usfirst.frc.team5112.robot.commands.RunNegative;
import org.usfirst.frc.team5112.robot.commands.RunPositive;
import org.usfirst.frc.team5112.robot.commands.Stop;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


public class OI {
	
	public JoystickButton joystickButtonThree;
    public JoystickButton joystickButtonFour;
    public JoystickButton joystickButtonFive;
    
	public Joystick joystick;
	
	public OI(){
		joystick = new Joystick(0);
		
		joystickButtonThree = new JoystickButton(joystick, 3);
		joystickButtonThree.whenPressed(new Stop());
		joystickButtonFour = new JoystickButton(joystick, 4);
		joystickButtonFour.whenPressed(new RunPositive());
		joystickButtonFive = new JoystickButton(joystick, 5);
		joystickButtonFive.whenPressed(new RunNegative());
	}
}
