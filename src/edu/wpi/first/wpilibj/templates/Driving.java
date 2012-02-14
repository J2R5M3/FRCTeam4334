package edu.wpi.first.wpilibj.templates;
import edu.wpi.first.wpilibj.RobotDrive;
public class Driving extends Robot4334{
   
    public RobotDrive robotDrive;
    
    public void init() {
        robotDrive = new RobotDrive(1, 3, 2, 4);
        robotDrive.setSafetyEnabled(false);
    }
    
    
    public void tankDrive(float leftSpeedInput, float rightSpeedInput, double defaultSpeedPercentage) {
        float leftSpeed = leftSpeedInput;
        float rightSpeed = rightSpeedInput;
        
        leftSpeed =  (float) (0.94*(leftSpeed*leftSpeed)+0.05);
        rightSpeed = (float) (0.94*(rightSpeed*rightSpeed)+0.05); 
        leftSpeed /= defaultSpeedPercentage;
        rightSpeed /= defaultSpeedPercentage;
        
        robotDrive.tankDrive(leftSpeed, rightSpeed);
        processInformation.finalLeftSpeed = leftSpeed;
        processInformation.finalRightSpeed = rightSpeed;
    }
    
    public void straightDrive(float speedInput, float turnInput , double defaultSpeedPercentage) {
        float speed = (float) (speedInput / defaultSpeedPercentage);
        float turn = turnInput;
        
        speed = (float) (0.94*(speed*speed)+0.05);
        
        robotDrive.drive(speed,turn);
        processInformation.finalSpeed = speed;
        processInformation.finalTurn = turn;
    }
    
    public void driveFor(float speed, float turn, double seconds) {
        while(timerControl.timerControl("get") <seconds)
            
            robotDrive.drive(speed, turn);
            processInformation.finalSpeed = speed;
            processInformation.finalTurn = turn;
    }
 
    public void stopMotor() {
        robotDrive.drive(0,0);
        robotDrive.stopMotor();
        processInformation.finalSpeed = 0; 
        processInformation.finalTurn = 0;
        processInformation.finalLeftSpeed = 0;
        processInformation.finalRightSpeed = 0;
    }
}