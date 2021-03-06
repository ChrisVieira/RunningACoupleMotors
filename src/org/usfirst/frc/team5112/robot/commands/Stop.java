package org.usfirst.frc.team5112.robot.commands;

import org.usfirst.frc.team5112.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Stop extends Command {

	public Stop() {
		requires(Robot.MotorSet);
	}

	protected void initialize() {
	}

	protected void execute() {
		Robot.MotorSet.stop();
	}

	protected boolean isFinished() {
		return true;
	}

	protected void end() {
		Robot.MotorSet.stop();
	}

	protected void interrupted() {
	}
}
