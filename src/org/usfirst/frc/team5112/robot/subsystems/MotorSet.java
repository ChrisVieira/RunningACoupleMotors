package org.usfirst.frc.team5112.robot.subsystems;

import org.usfirst.frc.team5112.robot.commands.OperatorControl;
import org.usfirst.frc.team5112.robot.commands.RunPositive;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class MotorSet extends Subsystem {
	public final VictorSP motorA = org.usfirst.frc.team5112.robot.RobotMap.motor1;
	public final VictorSP motorB = org.usfirst.frc.team5112.robot.RobotMap.motor2;
	public double motorSpeed = 0.00;
	public double interval = 0.05;
	public double gearingConstant = 0.4;
	
	public void initDefaultCommand() {
//		setDefaultCommand(new RunPositive());
		setDefaultCommand(new OperatorControl());
	}

	public void runFullSpeedPositive(double speed) {
		motorA.set(speed); //Different Gearing
		motorB.set(speed * gearingConstant);
	}

	public void runFullSpeedNegative(double speed) {
		runFullSpeedPositive(-speed);
	}

	public void rotateClockwise(double speed) {
		motorA.set(speed);
		motorB.set(-speed);
	}
	
	public void rotateCounterclockwise(double speed) {
		rotateClockwise(-speed);
	}
	public void stop() {
		motorA.stopMotor();
		motorB.stopMotor();
	}
	
	public void operatorControl(Joystick joystick) {
		motorA.set(joystick.getY());
		motorB.set(joystick.getY());
	}
	
	public void increaseMotorSpeed(double amount) {
		if (motorSpeed + amount >= 1) {
			motorSpeed = 1.00;
		} else if (motorSpeed  + amount <= 0) {
			motorSpeed = 0.00;
		} else {
			motorSpeed += amount;
		}
	}
	
	public void decreaseMotorSpeed(double amount) {
		increaseMotorSpeed(-amount);
	}

}
