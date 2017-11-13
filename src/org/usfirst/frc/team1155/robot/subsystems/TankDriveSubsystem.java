package org.usfirst.frc.team1155.robot.subsystems;

import org.usfirst.frc.team1155.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

public class TankDriveSubsystem extends Subsystem {
	CANTalon frontLeft, frontRight, backLeft, backRight;

	public TankDriveSubsystem() {
		frontLeft = new CANTalon(PortMap.DRIVE_FRONT_LEFT_TALON);
		frontRight = new CANTalon(PortMap.DRIVE_FRONT_RIGHT_TALON);
		backLeft = new CANTalon(PortMap.DRIVE_BACK_LEFT_TALON);
		backRight = new CANTalon(PortMap.DRIVE_BACK_RIGHT_TALON);
	}

	@Override
	protected void initDefaultCommand() {
		frontRight.set(0);
		frontLeft.set(0);
		backRight.set(0);
		backLeft.set(0);
	}

	public void setSpeed(double leftSpeed, double rightSpeed) {
		frontRight.set(rightSpeed);
		frontLeft.set(leftSpeed);
		backRight.set(rightSpeed);
		backLeft.set(leftSpeed);
	}
}
