package org.usfirst.frc.team5112.robot.commands;

import org.usfirst.frc.team5112.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class RunClockwise extends Command {

	double time = 0;
	
    public RunClockwise() {
    	requires(Robot.MotorSet);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.MotorSet.rotateClockwise(Robot.MotorSet.motorSpeed);
    	Robot.MotorSet.motorA.set(Robot.MotorSet.motorSpeed);
    	Robot.MotorSet.motorB.set(-(Math.sin(time) + 1)/2 * 0.10);
    	time += 0.2;
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    	Robot.MotorSet.stop();
    }
}
