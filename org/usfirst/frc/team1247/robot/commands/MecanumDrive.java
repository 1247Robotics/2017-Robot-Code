package org.usfirst.frc.team1247.robot.commands;

public class MecanumDrive extends BaseCommand{
	public MecanumDrive() {
		System.out.println("Mecanum initialization");
		//DUNNO IF WE NEED THROTTLE
		//throttle = 1.0;
		
		requires(driveTrain);
	}
	
	@Override
	protected void execute() {
		//throttle = Math.abs(oi.getZThrottle());
		//System.out.println("Send Drive?");
		driveTrain.mecanumDrive(oi.getLeftXAxis(),
								oi.getLeftYAxis(),
								oi.getRightXAxis());
	}
	
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		super.initialize();
		//System.out.println("Can I even??");
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
