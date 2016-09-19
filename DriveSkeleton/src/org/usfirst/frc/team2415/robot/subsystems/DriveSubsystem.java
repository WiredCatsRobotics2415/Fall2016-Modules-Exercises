package org.usfirst.frc.team2415.robot.subsystems;

import org.usfirst.frc.team2415.robot.RobotMap;
import org.usfirst.frc.team2415.robot.commands.DriveCommand;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSubsystem extends Subsystem {
    
    
	CANTalon leftTalon1, leftTalon2, rightTalon1, rightTalon2;
	Encoder leftEncoder, rightEncoder;
	
    public void initDefaultCommand() {
        setDefaultCommand(new DriveCommand());
    }
    
    public DriveSubsystem(){
    	leftTalon1 = new CANTalon(RobotMap.LEFT_TALON_1);
    	leftTalon2 = new CANTalon(RobotMap.LEFT_TALON_2);
    	rightTalon1 = new CANTalon(RobotMap.RIGHT_TALON_1);
    	rightTalon2 = new CANTalon(RobotMap.RIGHT_TALON_2);
    	
    	rightEncoder = new Encoder(RobotMap.RIGHT_ENCODER[0], RobotMap.RIGHT_ENCODER[1]);
    	leftEncoder = new Encoder(RobotMap.LEFT_ENCODER[0], RobotMap.LEFT_ENCODER[1]);
    }
    
    public void setMotors(double left, double right) {
    	leftTalon1.set(left);
    	leftTalon2.set(left);
    	rightTalon1.set(-right);
    	rightTalon2.set(-right);
    }
    
    public void stopMotors() {
    	setMotors(0,0);
    }
    
    public void resetEncoders() {
    	leftEncoder.reset();
    	rightEncoder.reset();
    }
    
    public double getLeftEncoder() {
    	return leftEncoder.get();
    }
    
    public double getRightEncoder() {
    	return rightEncoder.get();
    }
}

