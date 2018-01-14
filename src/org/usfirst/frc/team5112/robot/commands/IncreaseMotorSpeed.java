package org.usfirst.frc.team5112.robot.commands;

import org.usfirst.frc.team5112.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class IncreaseMotorSpeed extends Command {

    public IncreaseMotorSpeed() {
    	requires(Robot.MotorSet);
    }

    protected void initialize() {
    	Robot.MotorSet.stop();
    }

    protected void execute() {
    	Robot.MotorSet.increaseMotorSpeed(Robot.MotorSet.interval);
		SmartDashboard.putNumber("Motor Speed: ", Robot.MotorSet.motorSpeed);
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}