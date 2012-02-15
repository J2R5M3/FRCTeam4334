package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.DriverStationLCD;

public class OutputToUser extends MainRobotFunctions{
/**
 * Logs string message to netbeans console
 * @author Joel Gallant
 * @param message Message to send to console
 */    
    public void log(String message) {
        System.out.println(message);
    }
/**
 * Line count of the driverstation user message
 * 0 = 1
 * 1 = 2
 * etc.
 */    
    public int lineCount;
/**
 * Used to display message on 'User message' part of DriverStation
 * Max 5 lines
 * @author Joel Gallant
 * @param message String to be displayed
 * @param firstLine Boolean representing if first line has been taken or not
 */
    public void outputDriverStationMessage(String message , boolean firstLine) {
        if(firstLine) {
            driverStationLCD.println(DriverStationLCD.Line.kUser2, 1, message);
            driverStationLCD.updateLCD();
            lineCount = 1;
        }
        else if(lineCount==1) {
            driverStationLCD.println(DriverStationLCD.Line.kUser3, 1, message);
            driverStationLCD.updateLCD();
            lineCount ++;
        }
        else if(lineCount==2) {
            driverStationLCD.println(DriverStationLCD.Line.kUser4, 1, message);
            driverStationLCD.updateLCD();
            lineCount ++;            
        }
        else if(lineCount==3) {
            driverStationLCD.println(DriverStationLCD.Line.kUser5, 1, message);
            driverStationLCD.updateLCD();
            lineCount ++;
        }
        else if(lineCount==4) {
            driverStationLCD.println(DriverStationLCD.Line.kUser6, 1, message);
            driverStationLCD.updateLCD();
            lineCount ++;
        }
    }
}
