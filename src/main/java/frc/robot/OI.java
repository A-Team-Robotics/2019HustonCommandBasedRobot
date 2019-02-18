/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.CloseGripper;
import frc.robot.commands.Intake;
import frc.robot.commands.MoveTurret;
import frc.robot.commands.MoveTurretLeft;
import frc.robot.commands.MoveTurretRight;
import frc.robot.commands.OutTake;
import frc.robot.commands.PlaceHatch;
import frc.robot.commands.RaiseElavator;
import frc.robot.commands.StopMotor;
import frc.robot.commands.StopTurret;
import frc.robot.commands.lowerElavator;
import frc.robot.commands.OpenGripper;

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
  private JoystickButton closeGripper = new JoystickButton(xboxController, 4);
  private JoystickButton openGripper = new JoystickButton(joyStick, 5);
  private JoystickButton Intake = new JoystickButton(joyStick, 4);
  private JoystickButton OutTake = new JoystickButton(joyStick, 3);
  private JoystickButton lowerElavator = new JoystickButton(joyStick, 1);
  private JoystickButton raiseElevator = new JoystickButton(joyStick, 2);
  private JoystickButton placeHatch = new JoystickButton(joyStick, 7);

  public OI() {
    MoveTurret.whenPressed(new MoveTurret());
    moveTurretLeft.whenPressed(new MoveTurretLeft());
    moveTurretRight.whenPressed(new MoveTurretRight());
    stopTurret.whenPressed(new StopTurret());
    stopMotor.whenPressed(new StopMotor());
    closeGripper.whenPressed(new CloseGripper());
    openGripper.whenPressed(new OpenGripper());
    Intake.whenPressed(new Intake());
    OutTake.whenPressed(new OutTake());
    lowerElavator.whenPressed(new lowerElavator());
    raiseElevator.whenPressed(new RaiseElavator());
    placeHatch.whenPressed(new PlaceHatch());

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
