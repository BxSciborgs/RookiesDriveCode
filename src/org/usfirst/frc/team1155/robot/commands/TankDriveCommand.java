package org.usfirst.frc.team1155.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

public class TankDriveCommand extends Command {

	public Joystick left = new Joystick(0);
	public Joystick right = new Joystick(1);
	
	public TankDriveCommand() {
		requires(TankDriveSubsystem); // using tank drive subsystem
	}
	
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		setSpeed(left.getY(),right.getY());
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}
