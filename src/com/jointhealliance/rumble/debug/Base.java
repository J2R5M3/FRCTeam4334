package com.jointhealliance.rumble.debug;

/**
 * Contains all DriverStation static methods and other useful methods used for 
 * finding the status of the robot / driverstation.
 * 
 * @author Joel Gallant
 */

public final class Base {
    
    /**
     * Gets the location of the team's driver station controls.
     *
     * @return the location of the team's driver station controls: 1, 2, or 3
     */
    public synchronized static int getAllianceLocation() {
//        return DriverStation.getInstance().getLocation();
        return 1;
    }
    
    /**
     * Return the team number that the Driver Station is configured for
     * @return The team number
     */
    public synchronized static int getTeamNumber() {
//        return DriverStation.getInstance().getTeamNumber();
        return 4334;
    }
    
    /**
     * Return the DS packet number.
     * The packet number is the index of this set of data returned by the driver station.
     * Each time new data is received, the packet number (included with the sent data) is returned.
     *
     * @return The DS packet number.
     */
    public synchronized static int getPacketCount() {
//        return DriverStation.getInstance().getPacketNumber();
        return 0;
    }
    
    /**
     * Is the driver station attached to a Field Management System?
     * Note: This does not work with the Blue DS.
     * @return True if the robot is competing on a field being controlled by a Field Management System
     */
    public synchronized static boolean FMSattached() {
//        return DriverStation.getInstance().isFMSAttached();
        return false;
    }
    
    /**
     * Read the battery voltage from the specified AnalogChannel.
     *
     * This accessor assumes that the battery voltage is being measured
     * through the voltage divider on an analog breakout.
     *
     * @return The battery voltage.
     */
    public synchronized static double getBatteryVoltage() {
//        return DriverStation.getInstance().getBatteryVoltage();
        return Math.random()+12;
    }    
    
    /**
     * Return the approximate match time
     * The FMS does not currently send the official match time to the robots
     * This returns the time since the enable signal sent from the Driver Station
     * At the beginning of autonomous, the time is reset to 0.0 seconds
     * At the beginning of teleop, the time is reset to +15.0 seconds
     * If the robot is disabled, this returns 0.0 seconds
     * Warning: This is not an official time (so it cannot be used to argue with referees)
     * @return Match time in seconds since the beginning of autonomous
     */
    public synchronized static double getMatchTime() {
//        return DriverStation.getInstance().getMatchTime();
        return System.currentTimeMillis();
    }
    
    /**
     * Gets a string value of which game mode robot should be in.
     * 
     * @return String "Teleop" , "Autonomous" or "Disabled".
     */
    public synchronized static String getGamePeriod() {
//        if(DriverStation.getInstance().isEnabled()) {
//            if(DriverStation.getInstance().isOperatorControl()) {
//                return "Teleop";
//            }else if(DriverStation.getInstance().isAutonomous()) {
//                return "Autonomous";
//            }else {
//                return "Disabled";
//            }
//        }else {
//            return "Disabled";
//        }
        return gamePeriod;
    }
    public static String gamePeriod = "Disabled";
    
    /** The Alliance name.
     * @return Alliance name
     */
    public synchronized static String getAllianceName() {
//        return DriverStation.getInstance().getAlliance().name;
        return "Red";
    }
 
}
