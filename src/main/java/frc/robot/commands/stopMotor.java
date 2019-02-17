/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

/**
 * Add your docs here.
 */
public class StopMotor extends InstantCommand {
  /**
   * Add your docs here.
   */
  public StopMotor() {
    super();
    // Use requires() here to declare subsystem dependencies
  requires(Robot.turret);
  Robot.turret.setTurretSpeed(1.0);

  }

  // Called once when the command executes
  @Override
  protected void initialize() {
  }

}
