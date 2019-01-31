/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SendableBase;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class Turret extends Subsystem {
  private static final WPI_TalonSRX turretMotorOne = new WPI_TalonSRX();

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
public class Encoder extends SendableBase{
  Encoder enc;
  enc = new Encoder(0, 1, false, Encoder.EncodingType.k4X);
  Encoder sampleEncoder  = new Encoder(0, 1, false, Encoder.EncodingType.k4X);
  sampleEncoder.setMaxPeriod(.1);
  sampleEncoder.setMinRate(10);
  sampleEncoder.setDistancePerPulse(5);
  sampleEncoder.setReverseDirection(true);
  sampleEncoder.setSamplesToAverage(7);
  Encoder = sampleEncoder = new Encoder(0, 1, false, Encoder.EncodingType.k4X);
  sampleEncoder.reset();
  Encoder samplEncoder = new Encoder(0, 1, false, Encoder.EncodingType.k4X);
  int count = sampleEncoder.get();
  double distance = sampleEncoder.getRaw();
  double distance = sampleEncoder.getDistance();
  double period  = sampleEncoder.getPeriod();
  double rate = sampleEncoder.getRate;
  Boolean direction = sampleEncoder.getDirection();
  Boolean stopped = sampleEncoder.getStopped();
}