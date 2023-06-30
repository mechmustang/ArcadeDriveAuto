package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.Chassis;

  public class autoCommand extends SequentialCommandGroup {
    private Chassis Chassis;

    public autoCommand(Chassis m_chassis) {
      m_chassis = Chassis;

      new SequentialCommandGroup(
        new driveForward(0.5, 1.0, Chassis),
        new driveForward(0.0, 0.5, Chassis),
        new driveForward(-0.5, 1.0, Chassis)
      );
    }
        
  }