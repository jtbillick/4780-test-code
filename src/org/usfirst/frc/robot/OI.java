package org.usfirst.frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.robot.commands.ExampleCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	Joystick leftJoystick = new Joystick(1); //TODO: find right port number and replace
	Joystick rightJoystick = new Joystick(2);
	
	JoystickButton rightButton7 = new JoystickButton(rightJoystick, 7);
	JoystickButton rightButton8 = new JoystickButton(rightJoystick, 8);
	
	public double getTurnValue() {
		return leftJoystick.getTwist();
	}
	public double getSpeedValue() {
	return rightJoystick.getThrottle();
	}
}

