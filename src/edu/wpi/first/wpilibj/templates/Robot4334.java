package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.*;

public class Robot4334 extends SimpleRobot {

//Declaring all classes    
public Driving driving;
public Input input;
public Logging logging;
public Controller controller;
public Intake intake;
public IntakeArm intakeArm;
public TimerControl timerControl;
public ProcessInformation processInformation;
public Autonomous autonomous;
public Reset reset;
public OperatorControl operatorControl;
public Gyro gyro;
public Encoder leftEncoder;
public Encoder rightEncoder;
public Joystick normalJoystick;   
public Joystick xboxController;
public DriverStationLCD driverStationLcd;
public RobotDrive robotDrive;
    public void robotInit() {
        
       
        intake.init();
        intakeArm.init();
        logging.init();
        processInformation.init();
        timerControl.init();
        autonomous.init();
        reset.init();
        driving = new Driving();
        input = new Input();
        logging = new Logging();
        controller = new Controller();
        intake = new Intake();
        intakeArm = new IntakeArm();
        timerControl = new TimerControl();
        processInformation = new ProcessInformation();
        autonomous = new Autonomous();
        reset = new Reset();
        gyro = new Gyro(1,1);
        leftEncoder = new Encoder(2,1,2,2);
        rightEncoder = new Encoder(2,3,2,4);
        normalJoystick = new Joystick(1);
        xboxController = new Joystick(1);
        driverStationLcd = new DriverStationLCD();
        operatorControl = new OperatorControl("xboxMode"); // xboxMode vs. joystick arguments
        robotDrive = new RobotDrive(1, 3, 2, 4);
    }
     
    
    public void autonomous() {
        while(isAutonomous() && isEnabled()) {
            autonomous.autoMode();
        }
    }
    
    public void operatorControl() {
        while(isOperatorControl() && isEnabled()) {
            operatorControl.run();
        }
    }
    
    public void disabled() {
        while(isDisabled()) {
            reset.resetAll();
        }
    }
}
