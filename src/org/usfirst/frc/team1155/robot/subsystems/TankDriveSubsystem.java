package org.usfirst.frc.team1155.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class TankDriveSubsystem extends Subsystem{
	
	Talon leftTalon = new Talon(1);
	Talon rightTalon = new Talon(2);
	@Override
	protected void initDefaultCommand() {
		leftTalon.setSpeed(0);
		rightTalon.setSpeed(0);
	}
	
	public void setSpeed(double leftSpeed, double rightSpeed)
	{
		leftTalon.setSpeed(leftSpeed);
		rightTalon.setSpeed(rightSpeed);
	}
}
