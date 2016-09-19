package org.usfirst.frc.team2415.robot.commands;

import org.usfirst.frc.team2415.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveCommand extends Command {

    public DriveCommand() {
    	//TODO:
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveSubsystem);
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	//TODO:
    	//just for kicks go ahead and set the motors zero
    	Robot.driveSubsystem.stopMotors();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double leftY = Robot.gamepad.leftY();
    	double rightY = Robot.gamepad.rightY();
    	
    	Robot.driveSubsystem.setMotors(leftY, rightY);
    	
    	System.out.println("Left Encoder: " + Robot.driveSubsystem.getLeftEncoder() + "\t Right Encoder: " + Robot.driveSubsystem.getRightEncoder());
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	//TODO:
    	//so this function should never really end but we
    	//like to cover all of our bases just in case so
    	//just make sure you set the motors to zero here
    	Robot.driveSubsystem.stopMotors();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	//TODO:
    	//let's say another function asks to use the the subsystem,
    	//we don't want the motors to keep running right? so we
    	//probably want to set the motors to zero here too
    	Robot.driveSubsystem.stopMotors();
    }
}
