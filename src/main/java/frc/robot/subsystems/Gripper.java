/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.*;


/**
 * Add your docs here.
 */
public class Gripper extends Subsystem {
  private static DoubleSolenoid solOne = new DoubleSolenoid(RobotMap.SolenoidOne[0], RobotMap.SolenoidOne[1]);
  private static DoubleSolenoid solTwo = new DoubleSolenoid(RobotMap.SolenoidTwo[2], RobotMap.SolenoidTwo[3]);



  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new SolenoidOneControl(false));
  }
  public void setposition(boolean pos) {
    if(pos == true) {
      solOne.set(Value.kForward);
    } else {
      solOne.set(Value.kReverse);

    }
  }
}
