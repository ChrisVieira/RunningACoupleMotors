package org.usfirst.frc.team5112.robot.commands;

import org.usfirst.frc.team5112.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DecreaseMotorSpeed extends Command {

    public DecreaseMotorSpeed() {
    	requires(Robot.MotorSet);
    }

    protected void initialize() {
    	Robot.MotorSet.stop();
    }

    protected void execute() {
    	Robot.MotorSet.decreaseMotorSpeed(Robot.MotorSet.interval);
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