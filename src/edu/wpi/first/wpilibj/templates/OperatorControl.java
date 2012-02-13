package edu.wpi.first.wpilibj.templates;
public class OperatorControl extends Robot{
    public boolean xboxMode;
    public void init() {
        
    }
    public OperatorControl(String args) {
        if (args.equals("xboxMode"))
            xboxMode = true;
        else 
            xboxMode = false;
    }
    public void run() {
        if(xboxMode) { //XBoxController mode
            if(controller.xboxGetButton(2)) {
                driving.stopMotor();
            }else {
                if(controller.getDriveType() == 'S') { //Straight driving with triggers
                    driving.straightDrive(controller.xboxGetAxis("triggers"), 0, 0.5);
                }else if(controller.getDriveType() == 'D') { //Dual stick driving
                    driving.tankDrive(controller.xboxGetAxis("leftY"),controller.xboxGetAxis("rightY"),0.5);
                }
            }
        }else { //Joystick mode
            driving.straightDrive(controller.joystickGetAxis('Y') ,controller.joystickGetAxis('X') , 0.5);
        }
    } 
}