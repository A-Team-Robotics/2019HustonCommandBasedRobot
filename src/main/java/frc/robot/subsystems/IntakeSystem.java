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
public class IntakeSystem extends Subsystem {
  private WPI_TalonSRX intakeMotor1 = new WPI_TalonSRX(RobotMap.intakeMotor);
  private Encoder intakeEncoder1 = new Encoder(RobotMap.intakeEncoder1, RobotMap.intakeEncoder1);
  private Encoder intakeEncoder2 = new Encoder(RobotMap.intakeEncoder2, RobotMap.intakeEncoder2);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new intake());
  }
  public void setIntakeSpeed(double speed) {
    intakeMotor1.set(speed);
  }
  public int getEncoder() {
    return intakeMotor1.getSelectedSensorPosition();

  }
}

