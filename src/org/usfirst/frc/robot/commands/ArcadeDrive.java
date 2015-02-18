package org.usfirst.frc.robot.commands;

import org.usfirst.frc.robot.subsystems.DriveTrain;
import org.usfirst.frc.robot.Robot;

import edu.wpi.first.wpilibj.RobotDrive;
public class ArcadeDrive {
	//protected DriveTrain driveTrain = Robot.driveTrain;
	
	protected DriveTrain driveTrain = Robot.driveTrain;
	private RobotDrive drive;
	
	
	public ArcadeDrive() {
		requires(Robot.driveTrain);
	}
	
	private void requires(DriveTrain driveTrain2) {
		// TODO Auto-generated method stub
		
	}

	protected void initalize(){
	}
	protected void execute(){
		
		 double twist = Robot.oi.getTurnValue();
		 double speed = Robot.oi.getSpeedValue();
		 drive.arcadeDrive(speed, twist);
		
		//x is turn axis
		//y is speed axis
	}
	
	protected void drive(double twist, double speed){
		driveTrain.ArcadeDrive(twist, speed);
	}
	
	protected boolean isFinished(){
		return false;
	}
	protected void end(){
		
	}
	

}
