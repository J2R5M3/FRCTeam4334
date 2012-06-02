package com.jointhealliance.rumble.main.modes;

import com.jointhealliance.rumble.debug.Log;

/**
 * Autonomous Class - runs autonomous with start method.
 * 
 * @author Joel Gallant
 */
public class Autonomous implements Runnable{
    
    private void init() {
        Log.write("Auto Init");
    }
    
    private void mainMethod() {
        Log.write("Auto Method");
    }
    
    private static boolean kFinished = true;
    private static Thread currentThread;
    
    @Override
    public void run() {
        kFinished = false;
        Log.write("Autonomous running");
        init();
        mainMethod();
        Log.write("Autonomous done");
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
            currentThread = new AutonomousThread();
            currentThread.setPriority(Thread.MAX_PRIORITY);
            currentThread.start();
        }
    }
    
    public static boolean isFinished() {
        return kFinished;
    }
    
    private static class AutonomousThread extends Thread {
        public AutonomousThread() {
            super(new Autonomous());
        }
    }
    
}
