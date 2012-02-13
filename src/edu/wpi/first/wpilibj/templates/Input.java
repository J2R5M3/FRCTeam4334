package edu.wpi.first.wpilibj.templates;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Gyro;

public class Input extends Robot{
    public Gyro gyro;
    public Encoder leftEncoder;
    public Encoder rightEncoder;
    public Joystick normalJoystick;
    public Joystick xboxController;
    public void init(){
        gyro = new Gyro(1,1);
        leftEncoder = new Encoder(2,1,2,2);
        rightEncoder = new Encoder(2,3,2,4);
        normalJoystick = new Joystick(1);
        xboxController = new Joystick(1);
    }
}
