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
//import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Timer;
import org.usfirst.frc5247.TestDrive.subsystems.DriveMotors;
//import org.usfirst.frc5247.TestDrive.subsystems.Scale;
//import org.usfirst.frc5247.TestDrive.RobotMap;
/**
 *
 */



public class TestAuton extends Command {
	
	Timer timer;
	
	//ADXRS450_Gyro myGyro = new ADXRS450_Gyro();
	
	//double angle = myGyro.getAngle();
	 // double Kp = .03; 
	 
	  	
	    
	   // private SPI m_spi;
	//ADXRS450_Gyro TestGyro;

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
	   
  	
 	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public TestAuton() {
    	
    	timer = new Timer();
    	requires(Robot.driveMotors);
    	//myGyro.reset();
    	//myGyro.calibrate();
    	//double port = 0;
    	//myGyro = SPI.Port(port);
    	
   

    
    	//ADXRS450_Gyro TestGyro = new ADXRS450_Gyro();

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    	timer.reset();
    	timer.start();
    	

    }
    //private ADXRS450_Gyro Gyro;
  
 
    //protected void periodically() {
    	//Robot.subsystem1.driveMe(.5, 0);
    //}
  
    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    	Robot.driveMotors.driveMe(0, 0);
    	//TODO execute
    	//myGyro.reset();
    	//myGyro.calibrate();
    	
  // Robot.subsystem1.driveMe(.7, 0);
   //Robot.subsystem1.driveMe(.7, 0);
//	Robot.subsystem1.driveMet(.7, .0);
//	if (timer.get()> 3) {
	//	Robot.subsystem1.stopMe();
	//	Robot.subsystem1.stopMe();
	//	}
	
	//else {
//	}
	//if (timer.get()> 4) {
		//New_Motor.forward();
	//}
	
	//else {
	//}
	//if(timer.get()>5) {
		//New_Motor.stop();
	//}
	//else {
	//}
//	if(timer.get()>6) {
	//	FirstSubsystem.startClimb();
	//}
	//if(timer.get()>7) {
	//	FirstSubsystem.stop();
	//}
	//if(timer.get()>7.5) {
		//pnumaticsCommandt(true);
	//}
    		
    		//Robot.subsystem1.driveMe(.3, 0);
    		//Robot.subsystem1.driveMet(.3, 0);
 
    	
    	
    
    	
    //	Robot.subsystem1.driveMe(.5, 0);
    	
    //	double rate;
    	//myGyro.
    	//rate = myGyro.getRate();
    //myGyro.ca
		//double Potato = Gyro.getAngle(); 
    	//Robot.subsystem1.driveMe(.4, -angle*Kp);
    	
    	//System.out.print(rate);
    	//Timer.delay(3);
    	//Robot.subsystem1.stopMe();
    	
    	//myGyro.calibrate();
    		
    	
    	//Robot.subsystem1.driveMe(.3, 0); // - (-rate * .5));
    	
    	//if(angle < -2) {
    		//	 if angle is -4 and rate is -1 then -(-4 -- 1) * Kp= 3 * .03
    			//Robot.subsystem1.driveMe(.4, ((angle - (rate + .1)) * Kp));
    			//Robot.subsystem1.driveMe(.4, 0);
    		//Robot.subsystem1.driveMe(.4, -(angle*Kp + (rate * Kp)));	
    		//}	
    			//if(angle >2)
    			//{
    				// if angle is 4 and rate is 1 then -(4 - 1) * Kp = -63 * .03 
    				//Robot.subsystem1.driveMe(.4, -angle*Kp - (rate * Kp));
    			//	Robot.subsystem1.driveMe(.4, ((angle - rate)  * Kp));
    				//Robot.subsystem1.driveMe(.4,  0);
    			//}
    			
    			//if (timer.get()>10) {
    				
    			//Robot.subsystem1.driveMe(.4, 0);
    			//}
    }
    			
    	private void pnumaticsCommandt(boolean b) {
		// TODO Auto-generated method stub
		
	}

		//new
    		//	if(timer.get()>10) {
    		
    		//Robot.subsystem1.driveMe(0, .1);
    	//}
    			//else {
    				
    			//}
    	//	}
    
    	
    	 //else //{
    	
    	//if(angle < .1 & angle > -.1) {
    			//Robot.subsystem1.stopMe();
    			//Timer.delay(10);
    			//Robot.subsystem1.driveMe(.4, 0);
    		//}
    	//}
    	
    	//Timer.delay(5);
    	//Robot.subsystem1.driveMe(-.4, -(-angle + rate)  * Kp);
    	//-angle*Kp
    	//Timer.delay(5);
    	//Robot.subsystem1.stopMe();
    	
  // if (angle > 10) {
    		
    //		Robot.subsystem1.stopMe();
    //}
    //if (angle < -10) {
    	//Robot.subsystem1.stopMe();
    //}
    //if(angle > -10 & angle < 10) {
    	//Robot.subsystem1.driveMe(.5, 0);
    //}
    	
    	
    	
    	
    	//AnalogInput Sensor = Robot.sensor;
    	
    	//double mv = (_sensor.getVoltage() * 1000);
        //double mm = (mv / _mvPerUnit) * _mmPerUnit;
        //SmartDashboard.putNumber("UltraSonic/Distance (mm)", mm);  
        //SmartDashboard.putNumber("UltraSonic/Distance (Mm)", (((SecondSensor.getVoltage() * 1000) / _mvPerUnit) * 5));
    	
    	
    	//double mv = (RobotMap.scaleSensor.getVoltage() * 1000);
    	//double mm = ((mv / 4.88) * 5);
    //	double ww = (((RobotMap.scaleSensor.getVoltage() * 1000) / mv) * 5);
    	//boolean p = false;
    	//boolean b = false;
    	//if (ww > 6000) {
    		
    		//PnumaticsCommand.scale6();
    		//p = false;
    	//}
    	//else {
    		//p = true;
    	//}
    	//if( ww < 4000) {
    		//PnumaticsCommand.scale4(); 
    		//b = true;
    		
    	//} else{
    		//b = false;
    	//}
    	//if(ww == 5000) {
    		//PnumaticsCommand.scale5();
    	//}

    


	

	// Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
    	if(timer.get() <2) {
    	return false;	
    	}
    	
    		return true;
    }

    // Called once after isFinished returns true
    // if cancel doesn't work, check inside robot if statement on teleopinit.
    @Override
    protected void end() {
    	
    	Robot.driveMotors.stopMe();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    	Robot.driveMotors.stopMe();
    }
    
}
