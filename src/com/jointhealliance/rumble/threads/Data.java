package com.jointhealliance.rumble.threads;

import com.jointhealliance.rumble.debug.Log;
import com.jointhealliance.rumble.display.Dashboard;
import com.jointhealliance.rumble.main.Interface;
import com.jointhealliance.rumble.settings.SavedValues;

/**
 * 
 * 
 * @author Joel Gallant
 */
public class Data implements Runnable{
    
    private void init() {
        Log.write("Data Init");
        SavedValues.init();
        SavedValues.save();
        Dashboard.init();
    }
    
    @SuppressWarnings("deprecation")
	private void mainMethod() {
        Dashboard.update();
        try {
            Thread.sleep((long)(SavedValues.getLagCompensation() * 1000));
            Interface.Delay.setText(""+SavedValues.getLagCompensation());
        } catch (InterruptedException ex) {
            
        }
    }
    
    private static Thread currentThread;
    private static boolean kInterupted = false; 
    private static boolean kFinished = false;
    
    @Override
    public void run() {
        kInterupted = false;
        kFinished = false;
        init();
        while(!kInterupted) {
            mainMethod();
        }
        Log.write("Data done");
        kFinished = true;
    }
    
    public static void start() {
        if(currentThread == null || !currentThread.isAlive()) {
            currentThread = new DataThread(new Data());
            currentThread.start();
        }
    }

    public static void stop() {
        kInterupted = true;
    }
        
    public static boolean isFinished() {
        return kFinished;
    }

    private static class DataThread extends Thread {
        public DataThread(Runnable r) {
            super(r);
        }
    }
    
}
