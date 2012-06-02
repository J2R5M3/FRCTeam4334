package com.jointhealliance.rumble.commandbase;

/**
 * Extendable class usable for dynamic commands.
 * 
 * @author Joel Gallant
 */
public abstract class Command extends CommandBase{
    
    /**
     * Runs command. Command will do everything outlined in it's methods.
     */
    public final void run() {
        init();
        boolean firstRun = true;
        while(!finished() || firstRun) {
            method();
            firstRun = false;
        }
        end();
    }
    
    /**
     * Initialization code - runs only once right before the main method.
     */
    public abstract void init();
    
    /**
     * Method - this is where the heart of the command runs.
     */
    public abstract void method();
    
    /**
     * Ending method - runs once right after {@code CommandTemplate.finished()} returns true.
     */
    public abstract void end();
    
    /**
     * Determines if the method is finished and should stop looping.
     * 
     * <p> The method will still run once even if this returns true.
     * 
     * @return Whether to stop the main method or continue looping.
     */
    public abstract boolean finished();
}
