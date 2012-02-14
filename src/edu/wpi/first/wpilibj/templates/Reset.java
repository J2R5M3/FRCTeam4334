package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Gyro;

public class Reset extends Robot4334 {
    public Gyro gyro;
    public Encoder leftEncoder;
    public Encoder rightEncoder;
    
    public void init() {
        gyro = new Gyro(1);
        leftEncoder = new Encoder(2,1,2,2);
        rightEncoder = new Encoder(2,3,2,4);
    }
    public void resetAll() {
        gyro.reset();
        leftEncoder.reset();
        rightEncoder.reset();
        driving.stopMotor();
    }
}
