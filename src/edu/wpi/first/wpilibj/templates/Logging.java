package edu.wpi.first.wpilibj.templates;
import edu.wpi.first.wpilibj.DriverStationLCD;

public class Logging extends Robot{
    
    public void init() {

    }
    public void logAll() {
        String gyroRead = Double.toString(input.gyro.getAngle());
        String leftEncoderRead = Double.toString(input.leftEncoder.getRate());
        String rightEncoderRead = Double.toString(input.rightEncoder.getRate());
        input.driverStationLcd.println(DriverStationLCD.Line.kUser2,1, "Gyro reads "+gyroRead);
        input.driverStationLcd.println(DriverStationLCD.Line.kUser3,1, "Left speed is "+processInformation.finalLeftSpeed);
        input.driverStationLcd.println(DriverStationLCD.Line.kUser4,1, "Left encoder reads "+leftEncoderRead);
        input.driverStationLcd.println(DriverStationLCD.Line.kUser6,1, "Right speed is "+processInformation.finalRightSpeed);
        input.driverStationLcd.println(DriverStationLCD.Line.kUser5,1, "Right encoder reads "+rightEncoderRead);
        input.driverStationLcd.updateLCD();
    }   
    public void logSpeed() {
        input.driverStationLcd.println(DriverStationLCD.Line.kUser2,1, "Right speed is "+processInformation.finalRightSpeed);
        input.driverStationLcd.println(DriverStationLCD.Line.kUser3,1, "Left speed is "+processInformation.finalLeftSpeed);
        input.driverStationLcd.updateLCD();
    }
    
    public void logEncoderSpeed() {
        String leftEncoderRead = Double.toString(input.leftEncoder.getRate());
        String rightEncoderRead = Double.toString(input.rightEncoder.getRate());
        input.driverStationLcd.println(DriverStationLCD.Line.kUser2,1, "Left encoder reads "+leftEncoderRead);
        input.driverStationLcd.println(DriverStationLCD.Line.kUser3,1, "Right encoder reads "+rightEncoderRead);
        input.driverStationLcd.updateLCD();
    }
    
    public void logGyro() {
        String line = Double.toString(input.gyro.getAngle());
        input.driverStationLcd.println(DriverStationLCD.Line.kUser2,1,"Gyro reads "+line);
        input.driverStationLcd.updateLCD();
        //Insert code to display value
    }
    
    public void log(String message) {
        System.out.println(message);
    }
}
