
package edu.wpi.first.wpilibj.templates;

// xbox controller for the win :D

public class ControllerXbox extends Robot4334 {
    
    public static final int LeftX = 1;
    public static final int LeftY = 2;
    public static final int Triggers = 3; //(Each trigger = 0 to 1, axis value = right - left)
    public static final int RightX = 4;
    public static final int RightY = 5;
    public static final int DPad = 6;
   
    public boolean brake() {
        
         brakeOn = false;
        if(XBoxController.getRawButton(2)) {
            
           drivetrain.drive(0.0,0.0);
           drivetrain.stopMotor();
            
           brakeOn = true;
        }
        return brakeOn;
    }
    
     public float returnTriggerSpeed() { // Get the speed value from the xbox controller triggers
         
        double speed = XBoxController.getRawAxis(Triggers);
            // speed = exp* growth on trigger getRawAxis value
            return (float) rightSpeed;
    }    
    
      public float returnTurn() {
          
          rightSpeed = returnTriggerSpeed();
          leftSpeed = rightSpeed; 
                
          //press button one for fine control 25% speed
            if(XBoxController.getRawButton(1)) {
                
                rightSpeed *= 0.25;
                leftSpeed *= 0.25;
            }
            
            // Imma goin fast again :D !!!!!!
            // press button 3 to use 100% speed
            if(XBoxController.getRawButton(3)) {
                
                rightSpeed *= 2;
                leftSpeed *= 2;              
            }
            
            //clayton wants to use this button for 75% control
            if(XBoxController.getRawButton(4)) {
                
                rightSpeed *= 0.75;
                leftSpeed *= 0.75;
            }
            
       // take right and left speed value calculate for exp* growth  
            rightSpeed = (float) (0.94*(rightSpeed*rightSpeed)+0.05); 
            leftSpeed = (float) (0.94*(leftSpeed*leftSpeed)+0.05);
            
            // default to 50% speed 
             rightSpeed *= 0.5;
             leftSpeed *= 0.5;
        
             return rightSpeed; 
      }
      
     
    
    public boolean getEmergency() {
        
        if(XBoxController.getRawButton(5)) {
          
            boolean emergency = true;
            return emergency;
        } else {
            return false;
        }
    }
}
   