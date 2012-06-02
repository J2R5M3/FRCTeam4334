package com.jointhealliance.rumble.main.modes;

import com.jointhealliance.rumble.debug.Log;

/**
 * Teleoperated Class - runs teleop with start and stop methods.
 * 
 * @author Joel Gallant
 */
public class Teleoperated implements Runnable{
    
    private void init() {
        Log.write("Tele Init");
    }
    
    private void mainMethod() {
        Log.write("Tele Method");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            
        }
    }
    
    private static Thread currentThread;
    private static boolean kInterupted = false; 
    private static boolean kFinished = true;
    
    @Override
    public void run() {
        kFinished = false;
        kInterupted = false;
        init();
        while(!kInterupted) {
            mainMethod();
        }
        Log.write("Teleoperted done");
        kFinished = true;
    }
    
    public static Thread getThread() {
        if(currentThread != null) {
            return currentThread;
        }else {
            return null;
        }
    }
    
    public static void start() {
        if(kFinished) {
            currentThread = new Teleoperated.TeleoperatedThread();
            currentThread.setPriority(Thread.MAX_PRIORITY);
            currentThread.start();
        }else {
            Log.write("Teleop already started");
        }
    }

    public static void stop() {
        kInterupted = true;
    }
    
    public static boolean isFinished() {
        return kFinished;
    }

    private static class TeleoperatedThread extends Thread {
        public TeleoperatedThread() {
            super(new Teleoperated());
        }
    }
    
}
