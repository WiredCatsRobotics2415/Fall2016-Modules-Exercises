package org.usfirst.frc.team2415.robot.commands;

import org.usfirst.frc.team2415.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class FireCatapultCommand extends Command {

    
	public FireCatapultCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
		
		/*TODO: Decalre subsystem dependencies
	     * hint: you have to access the catapultSubsystem from
	     * 		 the Robot class
	     */
		
		requires(Robot.CatapultSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	/*TODO: retract the catapult
    	 * hint: you have to access the functions from the
    	 * 		 catapultSubsystem from the Robot class
    	 */
    	
    	Robot.CatapultSubsystem.RetractCatapult();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	/*TODO: fire the catapult
    	 * hint: you have to access the functions from the
    	 * 		 catapultSubsystem from the Robot class
    	 * 
    	 */
    	
    	Robot.CatapultSubsystem.FireCatapult();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	/*TODO: retract the catapult
    	 * hint: you have to access the functions from the
    	 * 		 catapultSubsystem from the Robot class
    	 */
    	
    	Robot.CatapultSubsystem.RetractCatapult();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	/*TODO: retract the catapult
    	 * hint: you have to access the functions from the
    	 * 		 catapultSubsystem from the Robot class
    	 */
    	
    	Robot.CatapultSubsystem.RetractCatapult();
    }
    
}
