// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5247.TestDrive.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc5247.TestDrive.Robot;
import org.usfirst.frc5247.TestDrive.subsystems.DriveMotors;
import org.usfirst.frc5247.TestDrive.subsystems.SolenoidGroup0;
/**
 *
 */
public class ForkIn extends Command {
    public ForkIn() {
        requires(Robot.solenoidGroup0);
    }
   
    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
        Robot.solenoidGroup0.pnumaticsCommand("Fork", "false");
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    }
}
