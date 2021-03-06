package org.usfirst.frc.team5112.robot.commands;

import org.usfirst.frc.team5112.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class RunPositive extends Command {

	public RunPositive() {
		requires(Robot.MotorSet);
	}

	protected void initialize() {
	}

	protected void execute() {
		Robot.MotorSet.runFullSpeedPositive(Robot.MotorSet.motorSpeed);
//		System.out.println("Current: " + RobotMap.pdp.getCurrent(10));
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
		Robot.MotorSet.stop();
	}

	protected void interrupted() {
		Robot.MotorSet.stop();
	}
}
