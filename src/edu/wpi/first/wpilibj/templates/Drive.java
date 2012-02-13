package edu.wpi.first.wpilibj.templates;
public class Drive extends Robot4334 {
    
public static final double DRIVE_STRAIGHT = 0;
public static final double DRIVE_FULL_SPEED = 1;

    public void drive() {
        
        while(controllerXbox.brakeOn == false && controllerXbox.getEmergency() == false) {
            controllerXbox.returnTurn();
            leftSpeed = rightSpeed;
            drivetrain.tankDrive(leftSpeed , rightSpeed);
        }
  
        if (sensors.getEncoderSpeed('L') > (leftSpeed + 0.15) || sensors.getEncoderSpeed('L') < (leftSpeed - 0.15)) {
            if(sensors.getEncoderSpeed('R') > (rightSpeed + 0.15) || sensors.getEncoderSpeed('R') < (rightSpeed - 0.15)) {
                Logger.logMessage("Speed and encoder do not match");
            }
        }
    }
   
    public void runMotorFor(double seconds, double power, double turn) {
        
        robotTimer.timerControl("Start");
        
        while(robotTimer.timerControl("getTimer")<seconds){
            drivetrain.drive(power,turn);
        }
    }
    
    public void brake() { //Brake method - stops motors
        drivetrain.drive(0.0,0.0);
        drivetrain.stopMotor();
    }    
}



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 
package edu.wpi.first.wpilibj.templates;


public class Drive extends Robot4334 {
 
    public void runMotorFor(double seconds, double power, double turn) {
         
        robotTimer.timerControl("Start");
        
        while(robotTimer.timerControl("getTimer")<seconds){
            drivetrain.drive(power,turn);
        }
    }
    
}
*/