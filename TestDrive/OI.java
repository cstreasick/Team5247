// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5247.TestDrive;

import org.usfirst.frc5247.TestDrive.commands.*;

//import org.usfirst.frc5247.TestDrive.commands.FirstCommand;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
//import edu.wpi.first.wpilibj.buttons.*;
import org.usfirst.frc5247.TestDrive.DriveSwitcher;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


//import org.usfirst.frc5247.TestDrive.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    JoystickButton leftLED;
    JoystickButton rightLED;
    JoystickButton leftSpin;
    JoystickButton rightSpin;
    JoystickButton rightFaster;
    JoystickButton LeftFaster;
    JoystickButton joystickButton10;
    JoystickButton joystickButton9;
    JoystickButton joystickButton8;
    JoystickButton joystickButton7;
    JoystickButton joystickButton5;
    JoystickButton joystickButton4;
    JoystickButton joystickButton3;
    JoystickButton joystickButton1;
    JoystickButton driverJoystickButton1;
    JoystickButton driverJoystickButton2;
    JoystickButton driverJoystickButton5;
    JoystickButton driverJoystickButton6;
    private Button driveSwitcher;
    

    //JoystickButton leftRevLED;
    JoystickButton rightRevLED;
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

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static Joystick driveStick;
    public static Joystick opStick;
    
    
    
 

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
    	
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS'
        driveStick = new Joystick(0);
        
        opStick = new Joystick(1);
        
        //joystickButton13 = new JoystickButton(opStick, 13);
        //joystickButton13.whileHeld(new Command9());
        
        //joystickButton11 = new JoystickButton(opStick, 11);
        //joystickButton11.whileHeld(new Command8());
        
        //joystickButton12 = new JoystickButton(opStick, 12);
        //joystickButton12.whileHeld(new Command7());
        
        joystickButton10 = new JoystickButton(opStick, 10);
        joystickButton10.whileHeld(new ForkOut());
        joystickButton10.whenInactive(new ForkStop());

        joystickButton9 = new JoystickButton(opStick, 9);
        joystickButton9.whileHeld(new ForkIn());
        joystickButton9.whenInactive(new ForkStop());
         
        joystickButton8 = new JoystickButton(opStick, 8);
        //Up
        

        joystickButton7 = new JoystickButton(opStick, 7);
        //Down
    
        joystickButton5 = new JoystickButton(opStick, 5);
        joystickButton5.whileHeld(new Stop());
        
        joystickButton4 = new JoystickButton(opStick, 4);
        joystickButton4.whileHeld(new ElevatorUp());
        joystickButton4.whenInactive(new ElevatorStop());
        
        joystickButton3 = new JoystickButton(opStick, 3);
        joystickButton3.whileHeld(new BackMotorsDrive());

        //joystickButton2 = new JoystickButton(opStick, 2);

        
        

        joystickButton1 = new JoystickButton(opStick, 1);
        joystickButton1.whileActive(new ClawT());
    	joystickButton1.whenInactive(new ClawF());

        Button driveSwitcher = new JoystickButton(driveStick, 3);
        driveSwitcher.whenPressed(new DriveSwitcher() );
        
       

  //      driverJoystickButton1 = new JoystickButton(driveStick, 1);
//driverJoystickButton1.whenPressed(new DriveSwitcher());
        //driverJoystickButton1.whenInactive(new DriveShifter(false));

        driverJoystickButton2 = new JoystickButton(driveStick, 2);
        driverJoystickButton2.whileHeld(new backLifterE());
        driverJoystickButton2.whenInactive(new backLifterStop());
        
      ///  driverJoystickButton3 = new JoystickButton(driverStick, 3);
        //driverJoystickButton3.whileHeld(new ClawLeft());
        //driverJoystickButton3.whenInactive(new ClawHStop());

        //driverJoystickButton4 = new JoystickButton(driverStick, 4);
        //driverJoystickButton4.whileHeld(new ClawRight());
        //driverJoystickButton4.whenInactive(new ClawHStop());

        driverJoystickButton5 = new JoystickButton(driveStick, 5);
        driverJoystickButton5.whileHeld(new LiftersIn());
        driverJoystickButton5.whenInactive(new LiftersStop());

        driverJoystickButton6 = new JoystickButton(driveStick, 6);
        driverJoystickButton6.whileHeld(new LiftersOut());
        driverJoystickButton6.whenInactive(new LiftersStop());

      
        SmartDashboard.putData("Test Auton", new TestAuton());
       // SmartDashboard.putData("DriveCommand", new DriveCommand());
        //SmartDashboard.putData("Climb Motor", new FirstCommand());
      

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

  

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getDriveStick() {
        return driveStick;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

