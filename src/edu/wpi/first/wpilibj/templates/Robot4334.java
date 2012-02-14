package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.SimpleRobot;

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

    public void robotInit() {
        controller.init();
        driving.init();
        input.init();
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
    }
    
    public void autonomous() {
        while(isAutonomous() && isEnabled()) {
            autonomous.autoMode();
        }
    }
    
    public void operatorControl() {
        while(isOperatorControl() && isEnabled()) {
            
        }
    }
    
    public void disabled() {
        while(isDisabled()) {
            
        }
    }
}
