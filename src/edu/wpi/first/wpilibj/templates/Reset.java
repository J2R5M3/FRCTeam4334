package edu.wpi.first.wpilibj.templates;

public class Reset extends Robot4334 {
    
    public void init() {

    }
    public void resetAll() {
        input.gyro.reset();
        input.leftEncoder.reset();
        input.rightEncoder.reset();
        driving.stopMotor();
    }
}
