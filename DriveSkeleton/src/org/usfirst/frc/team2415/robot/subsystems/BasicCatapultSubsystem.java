package org.usfirst.frc.team2415.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class BasicCatapultSubsystem extends Subsystem {
    
	
	/*TODO: Create variables for the physical components of the robot
	 * 
	 * alright so the catapult consists of 4 Solenoids. Make 4 solenoids.
	 * 
	 */

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    /**TODO: Initialize the solenoid variables
     * hint: the constructor for a solenoid takes in two
     * 		 arguments, the PCM port (pneumatics control
     * 		 module - 20) and the PCM ID (random numbers
     * 		 from 0 - 8). look here if you're still confused
     * 		 http://first.wpi.edu/FRC/roborio/release/docs/java/edu/wpi/first/wpilibj/Solenoid.html
     * 
     * 		 also go ahead and do the ports in the RobotMap
     */
    public BasicCatapultSubsystem(){
    	
    }
    
    /**TODO: Write the function that fires the catapult
     * to fire the catapult, set all the solenoids to true
     */
    public void FireCatapult(){
    	
    }
    
    /**TODO: Write the function that retracts the catapult
     * to retract the catapult, set all the solenoids 
     */
    public void RetractCatapult(){
    	
    }
}

