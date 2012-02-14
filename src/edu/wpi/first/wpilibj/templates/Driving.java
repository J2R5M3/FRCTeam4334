package edu.wpi.first.wpilibj.templates;
import edu.wpi.first.wpilibj.RobotDrive;
public class Driving extends Robot4334{
   
    public RobotDrive robotDrive;
    public float finalSpeed;
    public float finalTurn;
    public float finalLeftSpeed;
    public float finalRightSpeed;
    
    public void init() {
        robotDrive = new RobotDrive(1, 3, 2, 4);
    }
    
    
    public void tankDrive(float leftSpeedInput, float rightSpeedInput, double defaultSpeedPercentage) {
        float leftSpeed = leftSpeedInput;
        float rightSpeed = rightSpeedInput;
        leftSpeed =  (float) (0.94*(leftSpeed*leftSpeed)+0.05);
        rightSpeed = (float) (0.94*(rightSpeed*rightSpeed)+0.05); 
        leftSpeed /= defaultSpeedPercentage;
        rightSpeed /= defaultSpeedPercentage;
        robotDrive.tankDrive(leftSpeed, rightSpeed);
        finalLeftSpeed = leftSpeed;
        finalRightSpeed = rightSpeed;
    }
    
    public void straightDrive(float speedInput, float turnInput , double defaultSpeedPercentage) {
        float speed = (float) (speedInput / defaultSpeedPercentage);
        float turn = turnInput;
        robotDrive.drive(speed,turn);
        finalSpeed = speed;
        finalTurn = turn;
    }
    
    public void driveFor(float speed, float turn, double seconds) {
        while(timerControl.timerControl("get") <seconds)
            robotDrive.drive(speed, turn);
            finalSpeed = speed;
            finalTurn = turn;
    }
 
    public void stopMotor() {
        robotDrive.drive(0,0);
        robotDrive.stopMotor();
        finalSpeed = 0; 
        finalTurn = 0;
        finalLeftSpeed = 0;
        finalRightSpeed = 0;
    }
}