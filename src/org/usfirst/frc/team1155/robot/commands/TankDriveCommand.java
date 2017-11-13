package org.usfirst.frc.team1155.robot.commands;

import org.usfirst.frc.team1155.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class TankDriveCommand extends Command {

	public TankDriveCommand() {
		requires(Robot.tankDriveSubsystem); // using tank drive subsystem
	}
	
	public static SmartDashboard sd = new SmartDashboard();

	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		sd.putString("Left value: ", "" + Robot.oi.left.getY());
		Robot.tankDriveSubsystem.setSpeed(Robot.oi.left.getY(), Robot.oi.right.getY());
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
		Robot.tankDriveSubsystem.setSpeed(0, 0);
	}
}
