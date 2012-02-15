package edu.wpi.first.wpilibj.templates;

public class OperatorControl extends Robot4334{
/**
 * Drives according to mode
 * @author Joel Gallant
 * @param mode xbox or joystick mode
 */   
    public void driving(String mode) {
        boolean xboxControllerModeEnabled = mode.equals("xbox");
        if(xboxControllerModeEnabled) {
            //Xbox mode function for driving 
            
            //Getting values of buttons and axises
            rightIntendedSpeed = joystickAndXbox.getXboxControllerAxis("rightY");
            leftIntendedSpeed = joystickAndXbox.getXboxControllerAxis("leftY");
            float triggerSpeed = joystickAndXbox.getXboxControllerAxis("triggers");
            boolean bButtonBrake = joystickAndXbox.getXboxControllerButton('B');
            boolean xButtonFullSpeed = joystickAndXbox.getXboxControllerButton('X');
            boolean aButton25PercentSpeed = joystickAndXbox.getXboxControllerButton('A');
            boolean leftBumperEmergencyButton = joystickAndXbox.getXboxControllerButton('R');
            
            //Determines straight mode versus turn
            boolean dualStick = (triggerSpeed < 0.05 && triggerSpeed > -0.05);
            double defaultSpeed = 0.5; //SET FOR DEFAULT SPEED
            
            if(xButtonFullSpeed) { //Full speed button
                    defaultSpeed = 1;
            }
            else if(aButton25PercentSpeed) { //25% button
                defaultSpeed = 0.25;
            }
            
            if(leftBumperEmergencyButton) { //Emergency button
                timer.start();
                do {
                    drivingControl.brake();
                }while(timer.get()<10);
            }
            
            //Brake
            while(bButtonBrake) { //Brake button
                drivingControl.brake();
            }
            
            //Dual stick mode
            while(dualStick && !bButtonBrake) {
                rightIntendedSpeed = (float) (0.94*(rightIntendedSpeed*rightIntendedSpeed)+0.05);
                leftIntendedSpeed = (float) (0.94*(leftIntendedSpeed*leftIntendedSpeed)+0.05);
                drivingControl.driveDualStick(rightIntendedSpeed , leftIntendedSpeed , defaultSpeed); 
            }
            //Trigger mode
            while(!dualStick && bButtonBrake){
                triggerSpeed = (float) (0.94*(triggerSpeed*triggerSpeed)+0.05);
                drivingControl.driveStraight(triggerSpeed, defaultSpeed); 
            }
        }
        else {
            //Joystick mode function for driving
            drivingControl.driveSpeedAndTurn(joystickAndXbox.getJoystickAxis('Y'), joystickAndXbox.getJoystickAxis('X'));
        }
    }
/**
 * Logs values on Driver Station user messages
 */   
    public void logging() {
        outputToUser.outputDriverStationMessage("Left motor speed : "+leftIntendedSpeed, true);
        outputToUser.outputDriverStationMessage("Right motor speed : "+rightIntendedSpeed, false);
        outputToUser.outputDriverStationMessage("Gyro reads : "+gyro.getAngle(), false);
        outputToUser.outputDriverStationMessage("Left Encoder reads : "+leftEncoder.getRate(), false);
        outputToUser.outputDriverStationMessage("Right Encoder reads : "+rightEncoder.getRate(), false);
    }
/**
 * Right motor intended speed in dual stick control
 */    
    public float rightIntendedSpeed;
/**
 * Left motor intended speed in dual stick control
 */
    public float leftIntendedSpeed;
}
