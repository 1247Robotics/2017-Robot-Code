package org.usfirst.frc.team1247.robot.subsystems;

import org.usfirst.frc.team1247.robot.RobotMap;
import org.usfirst.frc.team1247.robot.commands.MecanumDrive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.interfaces.Gyro;

public class DriveTrain extends Subsystem{
	private Talon talonFrontLeft, talonFrontRight, talonRearLeft, talonRearRight;
	
	private RobotDrive drive;
	private Gyro gyro;
	
	public DriveTrain() {
		//System.out.println("DriveTrain initialization");
		talonFrontLeft = new Talon(RobotMap.TALON_CHANNEL_FRONT_LEFT);
		talonRearLeft = new Talon(RobotMap.TALON_CHANNEL_REAR_LEFT);
		talonFrontRight = new Talon(RobotMap.TALON_CHANNEL_FRONT_RIGHT);
		talonRearRight = new Talon(RobotMap.TALON_CHANNEL_REAR_RIGHT);
		
		
		//LiveWindow.addActuator("left","talonLeft", talonLeft);
		//LiveWindow.addActuator("right","talonRight", talonRight);
		
		drive = new RobotDrive(talonFrontLeft, talonRearLeft, talonFrontRight, talonRearRight);
		drive.setSafetyEnabled(false);
	}
	
	@Override
	public void initDefaultCommand() {
		new MecanumDrive();
	}
	
	public void mecanumDrive(double leftx, double lefty, double rightx){
		drive.mecanumDrive_Cartesian(leftx, lefty, rightx, gyro.getAngle());
	}
}
