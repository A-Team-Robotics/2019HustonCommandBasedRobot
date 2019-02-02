/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.LimitSwitchNormal;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.MoveTurret;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.DigitalInput;

/**
 * Add your docs here.
 */
public class Turret extends Subsystem {
  private WPI_TalonSRX turretMotorOne = new WPI_TalonSRX(RobotMap.turretMotorOne);
  private Encoder turretEncoder = new Encoder(RobotMap.turretEncoder, RobotMap.turretEncoder);
  private DigitalInput limitSwitch = new DigitalInput(0);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    //setDefaultCommand(new limitSwitch());
  }

  public void setTurretSpeed(double speed) {
    turretMotorOne.set(speed);
  }
  public void getEncoder() {
    turretEncoder.getRaw();
  }

}


