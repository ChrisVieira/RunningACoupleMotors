package org.usfirst.frc.team5112.robot.commands;

import org.usfirst.frc.team5112.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class RunCounterclockwise extends Command {

    public RunCounterclockwise() {
    	requires(Robot.MotorSet);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.MotorSet.rotateCounterclockwise(Robot.MotorSet.motorSpeed);
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
