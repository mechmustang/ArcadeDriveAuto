// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Constants.OperatorConstants;
import frc.robot.subsystems.Chassis;
import frc.robot.commands.autoCommand;

public class RobotContainer {
  // The robot's subsystems and commands are defined here
  private final Joystick m_XboxController;
  private final Chassis m_chassis;

  private final autoCommand m_auto;

  //Contains subsystems, OI devices, and commands.
  public RobotContainer() {
    m_XboxController = new Joystick(OperatorConstants.kXBoxControllerPort);
    m_chassis = new Chassis();

    m_auto = new autoCommand(m_chassis);

    configureBindings();

    m_chassis.setDefaultCommand(
      new RunCommand(() -> m_chassis.arcadeDrive(
        m_XboxController.getRawAxis(Constants.kXBox.leftYAxis),
        m_XboxController.getRawAxis(Constants.kXBox.rightXAxis)),
        m_chassis));    
  }

  private void configureBindings() {
    /*
    final JoystickButton xBoxX = new JoystickButton(m_XboxController, Constants.kXBox.buttonX);
    final JoystickButton xBoxA = new JoystickButton(m_XboxController, Constants.kXBox.buttonA);
    final JoystickButton xBoxB = new JoystickButton(m_XboxController, Constants.kXBox.buttonB);
    final JoystickButton xBoxY = new JoystickButton(m_XboxController, Constants.kXBox.buttonY);
    final JoystickButton xBoxBack = new JoystickButton(m_XboxController, Constants.kXBox.buttonBack);
    final JoystickButton xBoxStart = new JoystickButton(m_XboxController, Constants.kXBox.buttonStart);
    */

    final JoystickButton trigger = new JoystickButton(m_XboxController, Constants.kXBox.buttonRightBumper);

    trigger.onTrue(new InstantCommand(m_chassis::setMaxOutputLow, m_chassis)).onFalse(new InstantCommand(m_chassis::setMaxOutputHigh, m_chassis));
  }

  public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    return m_auto;
  }


}
