/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class DriveSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  private static final WPI_TalonSRX frontLeftMotor = new WPI_TalonSRX(RobotMap.frontLeftCIM);
  private static final WPI_TalonSRX frontRightMotor = new WPI_TalonSRX(RobotMap.frontRightCIM);
  private static final WPI_TalonSRX backLeftMotor = new WPI_TalonSRX(RobotMap.backLeftCIM);
  private static final WPI_TalonSRX backRightMotor = new WPI_TalonSRX(RobotMap.backRightCIM);




  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
