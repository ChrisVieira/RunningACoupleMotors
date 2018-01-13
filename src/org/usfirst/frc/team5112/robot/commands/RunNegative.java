package org.usfirst.frc.team5112.robot.commands;

import org.usfirst.frc.team5112.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class RunNegative extends Command {

	public RunNegative() {
		requires(Robot.MotorSet);
	}

	protected void initialize() {
	}

	protected void execute() {
		Robot.MotorSet.runFullSpeedNegative(1);
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
