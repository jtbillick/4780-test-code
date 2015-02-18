
package org.usfirst.frc.robot.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.robot.commands.ArcadeDrive2;

/**
 *
 */
public class DriveTrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	private RobotDrive drive;
	
	
	public void ArcadeDrive(double twist, double speed){
		drive.arcadeDrive(speed, twist);
	}


	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
    	setDefaultCommand(new ArcadeDrive2());
    }


	private void setDefaultCommand(
			org.usfirst.frc.robot.commands.ArcadeDrive2 arcadeDrive) {
		// TODO Auto-generated method stub
		
	}
}

