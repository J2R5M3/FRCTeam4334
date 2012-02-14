package edu.wpi.first.wpilibj.templates;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Gyro;
public class Input extends Robot4334{

    public Gyro gyro;
    public Encoder leftEncoder;
    public Encoder rightEncoder;
    public void init(){
        gyro = new Gyro(1,1);
        leftEncoder = new Encoder(2,1,2,2);
        rightEncoder = new Encoder(2,3,2,4);
    }
    public double getGyro() {
        return gyro.getAngle();
    }
    
    public double getEncoderSpeed(char LorR) {
        leftEncoder = new Encoder(2,1,2,2);
        rightEncoder = new Encoder(2,3,2,4); 
        
        double speed = 0;
        // Lor stands for left or right
        if(LorR == 'L') {
            speed = leftEncoder.getRate();
        } else if(LorR == 'R') {
            speed = rightEncoder.getRate();
        }
       
        //INSERT CODE TO CONVERT RATE INTO -1 to +1
        return speed;
    }
    
     public double getEncoder(char LorR) {
        
        double distance = 0;
        if(LorR == 'L') {
            distance = leftEncoder.getDistance();
        } else if(LorR =='R') {
            distance = rightEncoder.getDistance();
        }
        return distance;

    }
}