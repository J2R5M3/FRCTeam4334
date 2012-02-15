package edu.wpi.first.wpilibj.templates;
import edu.wpi.first.wpilibj.*;
public class MainRobotFunctions extends SimpleRobot {
/**
 * @author Joel Gallant
 * Method to run while disabled
 */    
    public void disabled() {
//RESETING METHOD FOR SENSORS VALUES
        
//LOGGING DISABLED
        outputToUser.log("Disabled");
    }

//DECLARATION OF OBJECTS - FRC CLASSES

    public RobotDrive robotDrive;   
    public Gyro gyro; 
    public Encoder leftEncoder;  
    public Encoder rightEncoder;   
    public Timer timer;   
    public DriverStationLCD driverStationLCD; 
    public Joystick xboxController;  
    public Joystick normalJoystick;

    
//DECLARATION OF OBJECTS - CUSTOM CLASSES
 
    public OperatorControl operatorControl;
    public JoystickAndXbox joystickAndXbox;   
    public OutputToUser outputToUser;  
    public DrivingControl drivingControl;  
    public AutonomousControl autonomousControl;

/**
 * @author Joel Gallant
 * INITIATION OF ALL OBJECTS - HAPPENS ONCE AT THE BEGGING OF MATCH
*/    
    public void robotInit() {
//DECLARATION OF OBJECTS - GIVING OBJECTS CLASS RELATIONS - FRC CLASSES 
        
/**
 * @author Joel Gallant
 * Driving mechanism class
 */            
        robotDrive = new RobotDrive(1,3,2,4); //Driving
/**
 * @author Joel Gallant
 * Gyro main class
 */         
        gyro = new Gyro(1,1); //Gyro
/**
 * @author Joel Gallant
 * Left encoder class
 */           
        leftEncoder = new Encoder(1,1,1,2); //Left Encoder
/**
 * @author Joel Gallant
 * Right encoder class
 */          
        rightEncoder = new Encoder(1,3,1,4); //Right Encoder
/**
 * @author Joel Gallant
 * Timer provided by FRC - tracks time in seconds
 */         
        timer = new Timer(); //Timing mechanism
/**
 * @author Joel Gallant
 * Driver Station user messages provided by FRC 
 */         
        driverStationLCD = DriverStationLCD.getInstance(); //DriverStation message centre
/**
 * @author Joel Gallant
 * Xbox Controller class
 */           
        xboxController = new Joystick(1); //Xbox Controller
/**
 * @author Joel Gallant
 * Normal joystick class
 */         
        normalJoystick = new Joystick(1); //Normal joystick

//DECLARATION OF OBJECTS - GIVING OBJECTS CLASS RELATIONS - CUSTOM CLASSES
        
/**
 * @author Joel Gallant
 * Operator control class - contains methods to run the operator control
 */           
        operatorControl = new OperatorControl(); //Operator control class
/**
 * @author Joel Gallant
 * Joystick and Xbox class - contains input methods to retrieve axises and buttons from Xbox controller and Joystick
 */            
        joystickAndXbox = new JoystickAndXbox();
/**
 * @author Joel Gallant
 * Class used to output messages to user
 */        
        outputToUser = new OutputToUser();
/**
 * @author Joel Gallant
 * Class used for running motors
 */          
        drivingControl = new DrivingControl();
/**
 * @author Joel Gallant
 * Class used for autonomous mode - contains methods to run during autonomous
 */          
        autonomousControl = new AutonomousControl();
    }
/**
 * @author Joel Gallant
 * Autonomous mode method
 */    
    public void autonomous() {
        while(isAutonomous() && isDisabled()) {
//AUTONOMOUS METHOD
            //autonomousControl.autonomousMode();
//TESTING METHOD
            autonomousControl.testing();
        }
    }
/**
 * @author Joel Gallant
 * Operator Control method
 */
    public void operatorControl() {
        while(isOperatorControl() && isEnabled()) {
//OPERATOR CONTROL METHOD FOR DRIVING
            operatorControl.driving("xbox");
//LOG FUNCTION
//            operatorControl.logging();
        }
    }
}
