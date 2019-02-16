/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.intake;

/**
 * Add your docs here.
 */
public class Intake extends Subsystem {
  private WPI_TalonSRX intakeMotor1 = new WPI_TalonSRX(RobotMap.intakeMotor);
  private WPI_TalonSRX intakemotor2 = new WPI_TalonSRX(RobotMap.intakemotor2);
  private Encoder intakeEncoder = new Encoder(RobotMap.intakeEncoder, RobotMap.intakeEncoder);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new intake());
  }
  public void setIntakeSpeed(double speed) {
    intakeMotor1.set(speed);
  }
  public void setIntakeSpeed(double speed) {
    intakemotor2.set(speed);
  }
  public int getEncoder() {
    return intakeEncoder.getRaw();

  }
}

