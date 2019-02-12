/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.stopTurret;

/**
 * Add your docs here.
 */
public class Turret extends Subsystem {
  private WPI_TalonSRX turretMotorOne = new WPI_TalonSRX(RobotMap.turretMotorOne);
  private DigitalInput limitSwitch1 = new DigitalInput(0);
  private DigitalInput limitSwitch2 = new DigitalInput(1);
  private DigitalInput limitSwitch3 = new DigitalInput(2);
  private DigitalInput limitSwitch4 = new DigitalInput(3);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new stopTurret());
  }

  public void setTurretSpeed(double speed) {
    turretMotorOne.set(speed);
  }
  public int getEncoder() {
    return turretMotorOne.getSelectedSensorPosition();
  }

}


