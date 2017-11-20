package org.usfirst.frc.team1155.robot.commands;

import org.usfirst.frc.team1155.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class GearDropperCommand extends Command {

	public GearDropperCommand()
	{
		requires(Robot.gearDropperSubsystem);
	}
	
	public SmartDashboard sd = new SmartDashboard();
	
	@Override
	protected void initialize() {
	}
	
	@Override
	protected void execute() {
		Robot.gearDropperSubsystem.close();
	}
	
	@Override
	protected boolean isFinished() {
		return false;
	}
	
	@Override
	protected void end() {
	}
	
	@Override
	protected void interrupted() {
		Robot.tankDriveSubsystem.setSpeed(0, 0);
	}

}
