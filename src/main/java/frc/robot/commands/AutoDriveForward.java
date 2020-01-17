/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.DriveSub;

public class AutoDriveForward extends CommandBase {

  double distance;
  /**
   * Creates a new AutoDriveForward.
   */
  public AutoDriveForward(double distance, DriveSub subsystem) {

    this.distance = distance;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    // DriveSub.l1.getSensorCollection().setQuadraturePosition(0, 10);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    RobotContainer.driveSub.drive(0.3, 0);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    RobotContainer.driveSub.drive(0, 0);
    System.out.println("dsdfds");
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {

  //   if (DriveSub.l1.getSensorCollection().getQuadraturePosition() >= distance) {
  //     return true;
  //   } else {
  //     return false;
  //   }
  // }

}