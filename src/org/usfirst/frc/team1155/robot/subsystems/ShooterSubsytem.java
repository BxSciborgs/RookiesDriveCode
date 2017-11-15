
package org.usfirst.frc.team1155.robot.subsystems;

import org.usfirst.frc.team1155.robot.OI;
import org.usfirst.frc.team1155.robot.PortMap;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ShooterSubsytem extends Subsystem {
	
	// FIELDS: speed, all of the servos
	// METHODS: shoot, setAngle, setSpeed
	private int speed;
	private Servo leftAngle, rightAngle, leftPower, rightPower;
	
	public void setSpeed(int newSpeed) {
		speed = newSpeed;
	}

	
	public void shoot(int s) {
	// s = 1 or 0. So you can set the speed to some speed times the s
		if (s == 0) {
			rightPower.set(1000);
			leftPower.set(1000);}
		else {
			rightPower.set(s);
			leftPower.set(2000 - s);}
	}
	
	public void setAngle(int angle) {
	// set the angle of both servos to the angle variable
		leftAngle.set(0 - angle);
		rightAngle.set(angle);}
	
	protected void initDefaultCommand() {
		leftAngle.set(-0.53);
		rightAngle.set(0.53);
		speed = 300;
		leftAngle = new Servo(PortMap.LEFT_SHOOT_SERVO);
		rightAngle = new Servo(PortMap.RIGHT_SHOOT_SERVO);
		leftPower = new Servo(PortMap.LEFT_AGITATOR_SERVO);
		rightPower = new Servo(PortMap.RIGHT_AGITATOR_SERVO);
	}
	
}
