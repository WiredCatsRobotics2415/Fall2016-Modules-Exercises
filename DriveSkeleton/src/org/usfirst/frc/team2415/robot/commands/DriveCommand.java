package org.usfirst.frc.team2415.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveCommand extends Command {

    public DriveCommand() {
    	//TODO:
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	//TODO:
    	//just for kicks go ahead and set the motors zero
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//TODO:
    	//alright so this is the spot where all the math happens
    	//to have the optimal control for the drive train. so before
    	//there was this massive wall of helping text but i accidentally
    	//deleted it all so now I'm just gonna give you some quick
    	//tips cause i'm lowkey kinda lazy
    	//
    	//1. get the values of the joysticks.
    	//	- the joysticks are in the Robot file, access them by
    	//	  typing Robot.nameOfGamepad.whateverYouWant()
    	//  - remember we are doing arcade drive so the
    	//	  you only need the y of one joystick and the x of
    	//	  the other
    	//
    	//2. set the deadband
    	//	- remember the deadband has to work for both positive
    	//	  and negative values
    	//
    	//3. do your interpolation
    	//	- you're gonna need to import the math package to use the
    	//	  math.pow(base,exponent) function
    	//		- if you're having trouble with this ask a neighbor
    	//	- set the interpolation factor to be 75% biased towards the
    	//	  cubic function
    	//
    	//4. now you're gonna have to implement arcade drive. remember
    	//	 that in order to do this you have to add the x and y values
    	// 	 of the two joysticks in a special way (remember back to Wednesday).
    	//   you should probably set the left and right variables to a value
    	//
    	//5. so now that you have the calculated values, you should probably
    	// 	 the motors to those values. remember if you haven't flipped one
    	//   of the values yet you should do that here
    	
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
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	//TODO:
    	//let's say another function asks to use the the subsystem,
    	//we don't want the motors to keep running right? so we
    	//probably want to set the motors to zero here too
    }
}
