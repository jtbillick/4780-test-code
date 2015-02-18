
package org.usfirst.frc.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import org.usfirst.frc.robot.commands.ArcadeDrive;
import org.usfirst.frc.robot.commands.ExampleCommand;
import org.usfirst.frc.robot.subsystems.DriveTrain;
import org.usfirst.frc.robot.subsystems.ExampleSubsystem;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static OI oi;
	
	
	//public static DriveTrain driveTrain;
	Talon rightTalon = new Talon(RobotMap.RIGHTTALONPORT);
	Talon leftTalon = new Talon(RobotMap.LEFTTALONPORT);

    private Command autonomousCommand;
//    private Command ArcadeDrive;
//    private Subsystem DriveTrain;
	public static final ExampleSubsystem exampleSubsystem = new ExampleSubsystem();


	public static final Subsystem ExampleSubsystem = null;
	public static DriveTrain driveTrain = new DriveTrain();
	public static ArcadeDrive arcadeDrive = new ArcadeDrive();


	//public static final Subsystem ExampleSubsystem = null;
	//public static final Command ArcadeDrive = null;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
		oi = new OI();
		driveTrain = new DriveTrain();
        // instantiate the command used for the autonomous period
        autonomousCommand = new ExampleCommand();
        arcadeDrive = new ArcadeDrive();
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        // schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
