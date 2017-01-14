package org.usfirst.frc.team1247.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	Joystick xboxDriveJoystick;
	
//------------------------------Controller Type--------------------------------------
	public OI () {
		xboxDriveJoystick = new Joystick(RobotMap.XBOX_DRIVE_ID);
	}
	
//------------------------------Axis-------------------------------------------------
	public double getLeftXAxis() {
		double axisValue = 0;
		
		axisValue = xboxDriveJoystick.getRawAxis(RobotMap.XBOX_LEFT_XAXIS_ID);
		return axisValue;
	}
	
	public double getLeftYAxis() {
		double axisValue = 0;
		
		axisValue = xboxDriveJoystick.getRawAxis(RobotMap.XBOX_LEFT_YAXIS_ID);
		return axisValue;
	}
	public double getRightXAxis() {
		double axisValue = 0;
		
		axisValue = xboxDriveJoystick.getRawAxis(RobotMap.XBOX_RIGHT_XAXIS_ID);
		return axisValue;
	}
}
