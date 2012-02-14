package edu.wpi.first.wpilibj.templates;

public class Controller extends Robot4334{
    
    
    public float xboxGetAxis(String axis) {
        int axisNum;
        if(axis.equals("leftY"))
            axisNum = 2;
        else if(axis.equals("leftX"))
            axisNum = 1;
        else if(axis.equals("rightY"))
            axisNum = 5;
        else if(axis.equals("rightX"))
            axisNum = 4;
        else if(axis.equals("triggers"))
            axisNum = 3;
        else
            axisNum = 0;
        
        if(axisNum == 2 || axisNum == 5) {
            processInformation.finalYAxis = (float) xboxController.getRawAxis(axisNum);
            return processInformation.finalYAxis;
        }else if(axisNum == 1 || axisNum == 4) {
            processInformation.finalXAxis = (float) xboxController.getRawAxis(axisNum);
            return processInformation.finalXAxis;            
        }else if(axisNum == 3) {
            processInformation.finalAxis = (float) xboxController.getRawAxis(axisNum);
            return processInformation.finalAxis;
        }else
            return 0;
    }
    
    public boolean xboxGetButton(int button) {
        return xboxController.getRawButton(button);
    }
    //hi how are you
    public float joystickGetAxis(char XorY) {
        if(XorY=='X')
            processInformation.finalXAxis = (float) normalJoystick.getX();
        else if(XorY=='Y')
            processInformation.finalAxis = (float) normalJoystick.getY();
        return processInformation.finalYAxis;
    }
    
    public boolean joystickGetButton(int button) {
        if(normalJoystick.getRawButton(button))
            return true;
        else
            return false;
    }
    
    public char getDriveType() {
        char StraightOrDual;
        if(controller.xboxGetAxis("triggers")>0.05 || controller.xboxGetAxis("triggers")<-0.05) {
            StraightOrDual = 'S';
        }else {
            StraightOrDual = 'D';
        }
        return StraightOrDual;
    }
}

/* 
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

