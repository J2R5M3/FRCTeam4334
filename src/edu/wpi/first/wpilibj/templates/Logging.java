package edu.wpi.first.wpilibj.templates;
import edu.wpi.first.wpilibj.DriverStationLCD;

public class Logging extends Robot{
    public DriverStationLCD driverStationOutput; 
    
    public void init() {
        driverStationOutput = new DriverStationLCD();
    }
    public void logAll() {
        //Insert code to log all methods
    }   
    public void logSpeed() {
        //Insert code to display finalSpeed / finalLeftSpeed / finalRightSpeed
    }
    public void logEncoderSpeed() {
        //Insert code to display speed
    }
    public void logGyro() {
        input.gyro.getAngle();
        driverStationOutput.println(DriverStationLCD.Line.kMain6,1,"Hello World");
        //Insert code to display value
    }
    public void log(String message) {
        System.out.println(message);
    }
}
