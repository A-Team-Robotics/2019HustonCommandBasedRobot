/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
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
  private static final SpeedControllerGroup left = new SpeedControllerGroup(frontLeftMotor, backLeftMotor);
  private static final SpeedControllerGroup right = new SpeedControllerGroup(frontRightMotor, backRightMotor);
  private static final DifferentialDrive arcadeDrive = new DifferentialDrive(left, right);




  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
  public void xboxDrive (Joystick xboxJoy) {
    arcadeDrive.arcadeDrive(xboxJoy.getRawAxis(1), xboxJoy.getRawAxis(4));
  }
}
