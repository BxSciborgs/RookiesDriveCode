package org.usfirst.frc.team1155.robot.subsystems;

import org.usfirst.frc.team1155.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class TankDriveSubsystem extends Subsystem{
	CANTalon leftCantalon = new CANTalon(RobotMap.leftMotor);
	CANTalon rightCantalon = new CANTalon(RobotMap.rightMotor);	
	@Override
	protected void initDefaultCommand() {
		leftCantalon.set(0);
		rightCantalon.set(0);
	}
	
	public void setSpeed(double leftSpeed, double rightSpeed)
	{
		leftCantalon.set(leftSpeed);
		rightCantalon.set(rightSpeed);
	}
}
