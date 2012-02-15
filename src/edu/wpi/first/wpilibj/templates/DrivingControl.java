package edu.wpi.first.wpilibj.templates;
public class DrivingControl extends MainRobotFunctions{
/**
 * Drives straight
 * @author Joel Gallant
 * @param speed Speed of motor
 * @param defaultSpeed Default speed of motor
 */    
    public void driveStraight(float speed , double defaultSpeed) {
        float realSpeed = speed;
        realSpeed *= defaultSpeed;
        robotDrive.drive(realSpeed, 0);
    }
/**
 * Driving dual stick
 * @author Joel Gallant
 * @param leftIntendedSpeed Left side speed
 * @param rightIntendedSpeed Right side speed
 * @param defaultSpeed Default speed of motor
 */
    public void driveDualStick(float leftIntendedSpeed , float rightIntendedSpeed , double defaultSpeed) {
        float leftSpeed = leftIntendedSpeed;
        float rightSpeed = rightIntendedSpeed;
        leftSpeed *= defaultSpeed;
        rightSpeed *= defaultSpeed;
        
        robotDrive.tankDrive(leftSpeed, rightSpeed);
    }
/**
 * Drives with a speed and turn value
 * @author Joel Gallant
 * @param speed Speed of motors - Not regulated by default speed
 * @param turn Turning value of motors - speed needs to be over 0 to turn
 */    
    public void driveSpeedAndTurn(float speed , float turn) {
        robotDrive.drive(speed, turn);
    }
/**
 * Drives for a certain amount of time
 * @author Joel Gallant
 * @param speed Speed of motors
 * @param turn Turning value of motors - speed needs to be over 0 to turn
 * @param time Time in seconds to run motor for
 */
    public void driveFor(float speed , float turn , float time) {
        timer.start();
        while(timer.get()<time) {
            robotDrive.drive(speed, turn);
        }
    }
/**
 * Braking mechanism
 */
    public void brake() {
        robotDrive.drive(0 , 0);
        robotDrive.stopMotor();
    }
}
