
package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Chassis;

public class driveForward extends CommandBase {

  private final Chassis m_chassis;
  private double m_speed;
  private double m_time;
  private double startTime;

  public driveForward(double s, double t, Chassis chassis) {

    m_chassis = chassis;
    addRequirements(m_chassis);

    m_speed = s;
    m_time = t * 1000;

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

    m_chassis.arcadeDrive(0.0, 0.0);
    startTime = System.currentTimeMillis();

  }

  @Override
  public void execute() {

    m_chassis.arcadeDrive(m_speed, 0.0);

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {

    m_chassis.arcadeDrive(0.0, 0.0);

  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return (m_time - startTime <= System.currentTimeMillis());
  }
}