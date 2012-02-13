package edu.wpi.first.wpilibj.templates;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Gyro;

public class Logging extends Robot{
    public Gyro gyro;
    public Encoder leftEncoder;
    public Encoder rightEncoder;
            
    public void init() {
        gyro = new Gyro(1,1);
        leftEncoder = new Encoder(2,1,2,2);
        rightEncoder = new Encoder(2,3,2,4);
    }
    public void logAll() {
        //Insert code to log all methods
    }   
    public void logSpeed() {
        
        /*Insert code to display finalSpeed / finalLeftSpeed / finalRightSpeed
        while(true){
            try{    
            String[][] array = new String[2][2];   
                        array[0][0] = "Left Speed";
                        array[0][1] = Float.toString(leftSpeed);
                        array[1][0] = "Right Speed";
                        array[1][1] = Float.toString(rightSpeed);
                        System.out.println("\n\n\n\n\n\n\n\n");
                        System.out.println(array[0][0]+" "+array[0][1]);
                        System.out.println(array[1][0]+" "+array[1][1]);
                Thread.sleep(40L);
            }catch (InterruptedException iex) {}
        }
        */
    }
    
    public void logEncoderSpeed() {
        //Insert code to display speed
    }
    
    public void logGyro() {
        gyro.getAngle();
        //Insert code to display value
    }
    
    public void log(String message) {
        System.out.println(message);
    }
}
