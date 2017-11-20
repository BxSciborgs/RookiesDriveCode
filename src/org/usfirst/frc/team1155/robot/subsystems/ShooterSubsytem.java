package org.usfirst.frc.team1155.robot.subsystems;

import org.usfirst.frc.team1155.robot.PortMap;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ShooterSubsytem extends Subsystem {
	
	// FIELDS: speed, all of the servos
	// METHODS: shoot, setAngle, setSpeed
	private int speed;
	private CANTalon rightShoot, leftShoot;
	
	public void setSpeed(int newSpeed) {
		speed = newSpeed;
	}

	public ShooterSubsytem() {
		speed = 300;
		leftShoot = new CANTalon(PortMap.LEFT_SHOOT_TALON);
		rightShoot = new CANTalon(PortMap.RIGHT_SHOOT_TALON);
	}
	
	public void shoot(int s) {
	// s = 1 or 0. So you can set the speed to some speed times the s
		if (s == 0) {
			rightShoot.set(0);
			leftShoot.set(0);}
		else {
			rightShoot.set(speed);
			leftShoot.set(0 - speed);}
	}
	
	protected void initDefaultCommand() {
	}
	
}
