package org.usfirst.frc.team5112.robot.commands;

import org.usfirst.frc.team5112.robot.OI;
import org.usfirst.frc.team5112.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class OperatorControl extends Command {

    public OperatorControl() {
    	requires(Robot.MotorSet);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.MotorSet.operatorControl(OI.joystick);
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