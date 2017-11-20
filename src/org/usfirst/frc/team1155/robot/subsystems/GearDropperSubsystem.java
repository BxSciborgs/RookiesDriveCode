package org.usfirst.frc.team1155.robot.subsystems;

import org.usfirst.frc.team1155.robot.PortMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

public class GearDropperSubsystem extends Subsystem {
	DoubleSolenoid LeftPiston, RightPiston;
	public GearDropperSubsystem() {
		LeftPiston = new DoubleSolenoid(0, PortMap.GEAR_PISTONS[0]);
		RightPiston = new DoubleSolenoid(0, PortMap.GEAR_PISTONS[1]);
	}
	@Override
	protected void initDefaultCommand() {
		LeftPiston.set(Value.kForward);
		RightPiston.set(Value.kForward);
	}
	
	public void open()
	{
		LeftPiston.set(Value.kReverse);
		RightPiston.set(Value.kReverse);
	}
	public void close()
	{
		LeftPiston.set(Value.kForward);
		RightPiston.set(Value.kForward);
	}
}
