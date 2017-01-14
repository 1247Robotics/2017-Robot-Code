package org.usfirst.frc.team1247.robot.commands;

import org.usfirst.frc.team1247.robot.OI;
import org.usfirst.frc.team1247.robot.RobotMap;

public class MecanumDrive extends BaseCommand{
	private double throttle;
	
	public MecanumDrive() {
		System.out.println("TankDrive initialization");
		//DUNNO IF WE NEED THROTTLE
		//throttle = 1.0;
		
		requires(driveTrain);
	}
	
	@Override
	protected void execute() {
		//throttle = Math.abs(oi.getZThrottle());
		
		driveTrain.mecanumDrive(oi.getLeftXAxis(),
								oi.getLeftYAxis(),
								oi.getRightXAxis());
	}
	
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		super.initialize();
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	protected void end() {
		// TODO Auto-generated method stub
		super.end();
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		super.interrupted();
	}
	
}
