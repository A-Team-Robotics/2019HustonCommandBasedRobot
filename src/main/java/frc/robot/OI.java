/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.MoveTurret;
import frc.robot.commands.moveTurretLeft;
import frc.robot.commands.moveTurretRight;
import frc.robot.commands.stopMotor;
import frc.robot.commands.stopTurret;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  public Joystick xboxController = new Joystick(1);
  public Joystick joyStick = new Joystick(2);
  private JoystickButton MoveTurret = new JoystickButton(xboxController, 1);
  private JoystickButton moveTurretRight = new JoystickButton(joyStick, 6);
  private JoystickButton moveTurretLeft = new JoystickButton(joyStick, 5);
  private JoystickButton stopMotor = new JoystickButton(xboxController, 2);
  private JoystickButton stopTurret = new JoystickButton(joyStick, 11);
  private JoystickButton openGripper = new JoystickButton(xboxController, 3);
  private JoystickButton closeGripper = new JoystickButton(xboxController,4 );
  private JoystickButton Intake = new JoystickButton(joyStick, 4);
  private JoystickButton OutTake = new JoystickButton(joyStick, 3);
  private JoystickButton LiftSystem = new JoystickButton(joyStick, 1);

  public OI() {
    MoveTurret.whenPressed(new MoveTurret());
    moveTurretLeft.whenPressed(new moveTurretLeft());
    moveTurretRight.whenPressed(new moveTurretRight());
    stopTurret.whenPressed(new stopTurret());
    stopMotor.whenPressed(new stopMotor());

  }

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
}
