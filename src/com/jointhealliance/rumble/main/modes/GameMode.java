/*
 * Robot Base Code - Created by Joel Gallant on Team 4334 - Alberta Tech Alliance
 * 
 * This code is intended for educational purposes only, and should only be used for 
 * such. This in no ways constitutes full robot code. It is meant to give a solid,
 * buildable framework for teams to build code on top of, so not to worry too much
 * about the backend of their program (In bug tracing). 
 * 
 * All new code (New and stable releases) will always be posted to http://code.google.com/p/4334-robotics/
 * All archives are there too.
 * 
 * Any suggestions, help, questions or comments about this robot code can be sent to
 * joelgallant236@gmail.com 
 */

package com.jointhealliance.rumble.main.modes;
//import edu.wpi.first.wpilibj.IterativeRobot;

import com.jointhealliance.rumble.debug.Base;
import com.jointhealliance.rumble.debug.Log;
import com.jointhealliance.rumble.threads.Data;


/*****************************Robot Base Code**********************************/
/*************************Developed by Team 4334*******************************/

public class GameMode /*extends IterativeRobot*/ {
    
    /**
     * Robot-wide initialization code should go here.
     *
     * Users should override this method for default Robot-wide initialization which will
     * be called when the robot is first powered on.  It will be called exactly 1 time.
     */
    public void robotInit() {
        Log.write("Starting...");
        Log.write("Starting Data Thread...");
        Data.start();
    }

    
    /**
     * Initialization code for disabled mode should go here.
     *
     * Users should override this method for initialization code which will be called each time
     * the robot enters disabled mode.
     */
    public void disabledInit() {
        Log.write("Disabled...");
        Base.gamePeriod = "Disabled";
        Teleoperated.stop();
        try {
            Teleoperated.getThread().join(1000);
        } catch (InterruptedException ex) {
            Log.write("Waited too long for teleoperated thread to terminate.");
        } catch(NullPointerException ex) {
            Log.write("No thread to terminate.");
        }
    }

    
    /**
     * Initialization code for autonomous mode should go here.
     *
     * Users should override this method for initialization code which will be called each time
     * the robot enters autonomous mode.
     */
    public void autonomousInit() {
        Log.write("Starting Autonomous...");
        Base.gamePeriod = "Autonomous";
        Teleoperated.stop();
        try {
            Teleoperated.getThread().join(1000);
        } catch (InterruptedException ex) {
            Log.write("Waited too long for teleoperated thread to terminate.");
        } catch(NullPointerException ex) {
            Log.write("No thread to terminate.");
        }
        Autonomous.start();
    }

    
    /**
     * Initialization code for teleop mode should go here.
     *
     * Users should override this method for initialization code which will be called each time
     * the robot enters teleop mode.
     */
    public void teleopInit() {
        Log.write("Starting Teleop...");
        Base.gamePeriod = "Teleop";
        try {
            Autonomous.getThread().join(1000);
        } catch(InterruptedException ex) {
            Log.write("Waited too long for autonomous thread to terminate.");
        } catch(NullPointerException ex) {
            Log.write("No thread to terminate.");
        }
        Teleoperated.start();
    }

    
    /**
     * Periodic code for disabled mode should go here.
     *
     * Users should override this method for code which will be called periodically at a regular
     * rate while the robot is in disabled mode.
     */
    public void disabledPeriodic() {

    }


    /**
     * Periodic code for autonomous mode should go here.
     *
     * Users should override this method for code which will be called periodically at a regular
     * rate while the robot is in autonomous mode.
     */
    public void autonomousPeriodic() {

    }


    /**
     * Periodic code for teleop mode should go here.
     *
     * Users should override this method for code which will be called periodically at a regular
     * rate while the robot is in teleop mode.
     */
    public void teleopPeriodic() {

    }


    /**
     * Continuous code for disabled mode should go here.
     *
     * Users should override this method for code which will be called repeatedly as frequently
     * as possible while the robot is in disabled mode.
     */
    public void disabledContinuous() {

    }


    /**
     * Continuous code for autonomous mode should go here.
     *
     * Users should override this method for code which will be called repeatedly as frequently
     * as possible while the robot is in autonomous mode.
     */
    public void autonomousContinuous() {

    }

    
    /**
     * Continuous code for teleop mode should go here.
     *
     * Users should override this method for code which will be called repeatedly as frequently
     * as possible while the robot is in teleop mode.
     */
    public void teleopContinuous() {

    }
}
