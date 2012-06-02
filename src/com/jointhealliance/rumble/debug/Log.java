package com.jointhealliance.rumble.debug;

import com.jointhealliance.rumble.main.Interface;
import com.jointhealliance.rumble.settings.Settings;

/**
 * Logger for logging purposes.
 * 
 * @author Joel Gallant
 */
public final class Log{
    private static int currentLine = 1;
    private static String messages = "";
    
    /**
     * Writes a message to the logger.
     * @param msg
     */
    public static void write(String msg) {
        write(msg, currentLine);
        currentLine++;
        if(currentLine > 6) {
            currentLine = 1;
        }
    }
    
/*    private static final DriverStationLCD.Line line1 = DriverStationLCD.Line.kMain6;
    private static final DriverStationLCD.Line line2 = DriverStationLCD.Line.kUser2;
    private static final DriverStationLCD.Line line3 = DriverStationLCD.Line.kUser3;
    private static final DriverStationLCD.Line line4 = DriverStationLCD.Line.kUser4;
    private static final DriverStationLCD.Line line5 = DriverStationLCD.Line.kUser5;
    private static final DriverStationLCD.Line line6 = DriverStationLCD.Line.kUser6; */
    
    private static synchronized void write(String s, int line) {
        if(Settings.LOGGING) {
            /*DriverStationLCD.Line l;
            switch(line) {
                case 1: l = line1;
                    break;
                case 2: l = line2;
                    break;
                case 3: l = line3;
                    break;
                case 4: l = line4;
                    break;
                case 5: l = line5;
                    break;
                case 6: l = line6;
                    break;
                default : l = line1;
                    break;
            }
            DriverStationLCD.getInstance().println(l, 1, s);*/
            update(); 
            try{
                FileLogger.getInstance().makeLog();
                FileLogger.getInstance().write(s);
            }catch(Ex.SoftwareError ex) {
                ex.printTrace();
            }
            System.out.println("LOG@Line:"+line+": "+s);
            if(Interface.DebugConsole != null) {
                messages += s + System.getProperty("line.separator");
                Interface.DebugConsole.setText(messages);
                Interface.DebugConsole.setCaretPosition(Interface.DebugConsole.getDocument().getLength());
            }
        }
        if(Interface.Logging != null) {
            Interface.Logging.setText(""+Settings.LOGGING);
        }
    }
    
    private static void update() {
        /*
         * DriverStationLCD.getInstance().updateLCD();
         */
    }
}
