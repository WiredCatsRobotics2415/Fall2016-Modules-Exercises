package org.usfirst.frc.team2415.robot.subsystems;

import org.usfirst.frc.team2415.robot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
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
	
	Solenoid solenoid1;
	Solenoid solenoid2;
	Solenoid solenoid3;
	Solenoid solenoid4;
	
	
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
    	 solenoid1 = new Solenoid(RobotMap.PCM_ID, RobotMap.CATAPULT_SOLENOIDS_1);
    	 solenoid2 = new Solenoid(RobotMap.PCM_ID, RobotMap.CATAPULT_SOLENOIDS_2);
    	 solenoid3 = new Solenoid(RobotMap.PCM_ID, RobotMap.CATAPULT_SOLENOIDS_3);
    	 solenoid4 = new Solenoid(RobotMap.PCM_ID, RobotMap.CATAPULT_SOLENOIDS_4);
    			    
    }
    
    /**TODO: Write the function that fires the catapult
     * to fire the catapult, set all the solenoids to true
     */
    public void FireCatapult(){
    	solenoid1.set(true);
    	solenoid2.set(true);
    	solenoid3.set(true);
    	solenoid4.set(true);
    	
    }
    
    /**TODO: Write the function that retracts the catapult
     * to retract the catapult, set all the solenoids 
     */
    public void RetractCatapult(){
    	solenoid1.set(false);
    	solenoid2.set(false);
    	solenoid3.set(false);
    	solenoid4.set(false);
    }
}

