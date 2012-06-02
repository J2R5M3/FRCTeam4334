package com.jointhealliance.rumble.debug;

//import com.sun.squawk.microedition.io.FileConnection;
import java.io.DataOutputStream;
import java.io.IOException;
import com.jointhealliance.rumble.settings.Settings;
//import javax.microedition.io.Connector;


/**
 * Experimental logging class used to write files to the cRIO.
 * 
 * @author Joel Gallant
 */
public final class FileLogger {
    private static FileLogger instance;
    
    /**
     * Gets an instance of the file logger.
     * @return
     * @throws com.jointhealliance.rumble.debug.Ex.SoftwareError  
     */
    public static FileLogger getInstance() throws Ex.SoftwareError{
        if(Settings.LOGGING) { 
            if(instance == null) {
                instance = new FileLogger();
            }
            return instance;
        }else {
            throw new Ex.SoftwareError("Testing mode not enabled");
        }
    }
    
    @SuppressWarnings("unused")
	private static final String PATH = "file:///log.txt";
    
    private static DataOutputStream kDos;
//    private static FileConnection kDonnection;
    
    /**
     * Opens the specified log file.
     */
    public synchronized void makeLog(){
        
        try {
            if (kDos != null) { 
                kDos.close();
                kDos = null;
            } 
//            if (kDonnection != null) {
//                kDonnection.close();
//                kDonnection = null;
//            }
//            
//            kDonnection = (FileConnection) Connector.open(PATH, Connector.READ_WRITE);
//            if (kDonnection.exists()) {
//                kDonnection.delete();
//                kDonnection.close();
//                kDonnection = (FileConnection)Connector.open(PATH, Connector.READ_WRITE);
//            }
//            
//            kDonnection.create();
//            
//            kDos = kDonnection.openDataOutputStream();
        } catch (IOException e) {
        }
    }
    
    /**
     * Writes the specified string (plus a newline) into the log file.
     * @param output - the string to be written.
     */
    public synchronized void write(String output){
        String kOutput = output + "\n";
        try {
            if (kDos != null)
                kDos.write(kOutput.getBytes(), 0, kOutput.getBytes().length);
        } catch (IOException e){
        }
    }
    
    /**
     * Closes the connection.
     */
    public synchronized void close(){ 
//        if (kDonnection != null && kDos != null) {
//            try {
//                kDonnection.close();
//                kDos.close();
//            } catch (IOException e){
//            } finally {
//                kDonnection = null;
//                kDos = null;
//            }
//        }
    }
    
    /**
     * Closes the file temporarily for other file writing operations
     */
    public synchronized void pause(){
//        try {
//            kDonnection.close();
//            kDos.close();
//        } catch (IOException e){
//        }
    }
    
    /**
     * Reopens the last file for resumed logging functionality
     */
    public synchronized void resume(){
//        try {
//            kDonnection.create();
//            kDos = kDonnection.openDataOutputStream();
//        } catch (IOException e){
//        }
    }
}