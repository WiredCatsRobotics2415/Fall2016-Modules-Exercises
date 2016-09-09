package org.usfirst.frc.team2415.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	//TODO:
	//here is where you make variables that holds the
	//physical parts of the robot the subsystem that has
	//jurisdiction over. lets say you wanted to create a
	//solenoid variable, it would look something like this:
	//
	//		Solenoid nameOfSolenoid;
	//
	//hint: we use CANTalons as motors (that's all you're really gonna need)

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void DriveSubsystem(){
    	//TODO:
    	//alright so this is actually something that isn't
    	//provided automatically when you create a subsystem.
    	//it's called a constructor and if you're in APCS
    	//you'll learn more about it later. but for now all
    	//you care about is that it's the place where you
    	//initialize all of your variables. 
    	//lets say for example you hypothetically wanted
    	//to initialize a CANTalon, it would look a little
    	//something like this:
    	//
    	//		nameOfTalon = new CANTalon(PORTOFTALON);
    	//
    	//remember that we keep all of our ports in the
    	//RobotMap class so you have to access them from
    	//there.
    }
    
    //TODO:
    //this is where you create all the functions for the
    //capabilities of the subsystem. if this is sort of
    //confusing you, think back to the human body example:
    //you have your infrastructure (mouth, heart, penis),
    //what can they do? (open/close, beat, hard)
    //
    //hint: lets say, perhaps, you wanted to know all the
    //		functions a CANTalon object has, you would go
    //		to the api website I showed you for all the
    //		nice documentation: http://first.wpi.edu/FRC/roborio/release/docs/java/
}

