package org.usfirst.frc.team5112.robot.subsystems;

import org.usfirst.frc.team5112.robot.commands.Stop;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class MotorSet extends Subsystem {
	private final VictorSP motorA = org.usfirst.frc.team5112.robot.RobotMap.motor1;
	private final VictorSP motorB = org.usfirst.frc.team5112.robot.RobotMap.motor2;

	public void initDefaultCommand() {
		setDefaultCommand(new Stop());
	}

	public void runFullSpeedPositive(double speed) {
		motorA.set(speed);
		motorB.set(speed);
	}

	public void runFullSpeedNegative(double speed) {
		runFullSpeedPositive(-speed);
	}

	public void stop() {
		motorA.stopMotor();
		motorB.stopMotor();
	}

}
