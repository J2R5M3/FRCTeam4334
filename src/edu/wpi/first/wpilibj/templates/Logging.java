package edu.wpi.first.wpilibj.templates;
import edu.wpi.first.wpilibj.DriverStationLCD;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Gyro;

public class Logging extends Robot{
    public Gyro gyro;
    public Encoder leftEncoder;
    public Encoder rightEncoder;
    public DriverStationLCD driverStationOutput; 
    
    public void init() {
        gyro = new Gyro(1,1);
        leftEncoder = new Encoder(2,1,2,2);
        rightEncoder = new Encoder(2,3,2,4);
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
        gyro.getAngle();
        driverStationOutput.println(DriverStationLCD.Line.kMain6,1,"Hello World");
        //Insert code to display value
    }
    public void log(String message) {
        System.out.println(message);
    }
}
