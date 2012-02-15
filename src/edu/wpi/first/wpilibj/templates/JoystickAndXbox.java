package edu.wpi.first.wpilibj.templates;

public class JoystickAndXbox extends Robot4334{   
/**
 * Variable for axis # on Xbox Controller
 */    
    public int axisNumber; 
/**
 * Returns the axis of inputed axis (In string form) - In form 'leftY' , 'rightX' , etc.
 * @author Joel Gallant
 * @param stickAxis Which axis of the xbox controller to use
 * @return The axis of @stickAxis
 */
    public float getXboxControllerAxis(String stickAxis) { //Gets an xboxController axis with string argument
/*
AXIS
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
        boolean error = false;
        
        //GETS WHICH AXIS int IS EQUIVILANT 
        if(stickAxis.equals("leftY")) {
            axisNumber = 2;
        }
        else if(stickAxis.equals("leftX")) {
            axisNumber = 1;
        }
        else if(stickAxis.equals("rightY")) {
            axisNumber = 5;
        }
        else if(stickAxis.equals("rightX")) {
            axisNumber = 4;
        }
        else if(stickAxis.equals("triggers")) {
            axisNumber = 3;
        }
        else if(stickAxis.equals("leftX")) {
            axisNumber =1;
        }
        else {
            outputToUser.log("ERROR - WRONG AXIS REQUESTED");
            error = true;
        }
        
        if(!error) {
            //GETS SPECIFIED AXIS AND RETURNS AS A FLOAT
            return (float) xboxController.getRawAxis(axisNumber);
        }
        else 
            //ERROR RETURNS 0
            return 0; 
    }   
/**
 * Returns a boolean of whether the inputted button is pressed or not
 * @author Joel Gallant
 * @param button Character of button - Right Bumper is R and Left Bumper is L
 * @return Boolean of whether the button is on or off
 */    
    public boolean getXboxControllerButton(char button) {
/* 
BUTTONS
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
 */
        int buttonValue;
        
        if(button == 'A') {
            buttonValue = 1;
        }
        else if(button =='B') {
            buttonValue = 2;
        }
        else if(button =='X') {
            buttonValue = 3;
        }
        else if(button =='Y') {
            buttonValue = 4;
        }
        else if(button =='R') { //RIGHT BUMPER
            buttonValue = 6;
        }
        else if(button =='L') { //LEFT BUMPER
            buttonValue = 5;
        }
        else {
            return false; //ERROR RETURNS FALSE
        }
        
        return xboxController.getRawButton(buttonValue);
    }
/**
 * Returns the value of the specified axis
 * @author Joel Gallant
 * @param XorY
 * @return Returns a float of the axis
 */    
    public float getJoystickAxis(char XorY) {
        if(XorY == 'X') 
            return (float) normalJoystick.getX();
        else
            return (float) normalJoystick.getY();
    }
/**
 * @author Joel Gallant
 * @param button Integer representing button
 * @return Returns boolean of whether the button is on or off
 */
    public boolean getJoystickButton(int button) {
        return normalJoystick.getRawButton(button);
    }
}
