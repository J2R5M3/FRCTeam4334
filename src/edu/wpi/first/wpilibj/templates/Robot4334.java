/*
 
THIS CODE IS MADE BY THE BEST PEOPLE IN THE WORLD, DO NOT STEAL.........please >_<
 
THINGS TO  ARE IN CAP

Instructions are in sentence form.

CHANGES AND NEWEST FILE IS AVAILIBLE AT http://code.google.com/p/4334-robotics/source/browse/trunk/Robotics/src/edu/wpi/first/wpilibj/templates/Robot4334.java

ASK Jaden/joel FOR HELP MAKING SUBVERSION WORK ON NETBEANS - TUTORIAL IS ON HOMEPAGE OF GOOGLE CODE

*/
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.*;
 
public class Robot4334 extends SimpleRobot {  //DECLARE ALL METHODS IN INIT AND SIMPLEROBOT
                                                
    public RobotDrive drivetrain;
    public Gyro gyro;
    public Encoder leftEncoder;
    public Encoder rightEncoder;
    public Logger logger;
    public ControllerXbox controllerXbox;
    public static final double DRIVE_STRAIGHT = 0;
    public static final double DRIVE_FULL_SPEED = 1;
    public Joystick XBoxController;
    public boolean brakeOn ;
    public float leftSpeed;
    public float rightSpeed;
    public Sensors sensors;
    public Timer timer;
    public RobotTimer robotTimer;
    public Drive Drive;
    
    public void robotInit() { //REMEMBER TO INITIALIZE EVERYTHING
        Drive = new Drive();
        logger = new Logger();
        controllerXbox = new ControllerXbox();
        XBoxController = new Joystick(1);
        drivetrain = new RobotDrive(1, 3, 2, 4);
        gyro = new Gyro(1 , 1); 
        timer = new Timer();
        robotTimer = new RobotTimer();
        sensors = new Sensors();
        leftEncoder = new Encoder(2,1,2,2);
        rightEncoder = new Encoder(2,3,2,4); 
    }
    
    public void autonomous() { 
        
        while(isAutonomous()&&isEnabled()){ //Makes sure in autonomous.
            Logger.logMessage("Autonomous control enabled");
        }
    }
    
    public void operatorControl() {
        
        while(isOperatorControl() && isEnabled()) {
        
            while(controllerXbox.brakeOn == false && controllerXbox.getEmergency() == false) {
            controllerXbox.returnTurn();
            leftSpeed = rightSpeed;
            drivetrain.tankDrive(leftSpeed , rightSpeed);
        }
            
            Logger.logMessage("Operator control enabled");
            
        }
    }


}

/*
 * 
 * do we even want to use these?
 * 
 *  public void RESET() {
        
        gyro.reset();
        leftEncoder.reset();
        rightEncoder.reset();
        timer.reset();
        drivetrain.stopMotor();
    }
 * 
 *  public void disabled() {
        RESET();
        Logger.logMessage("Is disabled");
    }  
    * 
    * public void EMERGENCY() { //ADD ALL FUNCTIONS HERE TO STOP ON ROBOT DURING EMERGENCY
        
        drivetrain.drive(0.0,0.0);
        
        robotTimer.timerControl("start");
        
        while(robotTimer.timerControl("getTimer")<10) {
            
            double time = (double) robotTimer.timerControl("getTimer");
            Logger.logMessage("EMERGENCY   :::   "+time+" SECONDS UNTIL RESTART");
        }
    }
    * 
    * 
    * 
1: A
2: B
3: X
4: Y
5: Left Bumper
6: Right Bumper
7: Back
8: Start
9: Left Joystick
10: Right Joystick
 
The axis on the controller follow this mapping
(all output is between -1 and 1)
1: Left Stick X Axis
-Left:Negative ; Right: Positive
2: Left Stick Y Axis
-Up: Negative ; Down: Positive
3: Triggers
-Left: Positive ; Right: Negative
4: Right Stick X Axis
-Left: Negative ; Right: Positive
5: Right Stick Y Axis
-Up: Negative ; Down: Positive
6: Directional Pad (Not recommended, buggy)
*/

