package com.jointhealliance.rumble.commands;

import com.jointhealliance.rumble.commandbase.Command;

/**
 * Example command used for testing purposes.
 * 
 * @author Joel Gallant
 */
public final class ExampleCommand extends Command{
    
    public ExampleCommand(String[] args) {
        
    }
    
    @Override
    public void init() {
        System.out.println("Run");
    }

    @Override
    public void method() {
        
    }

    @Override
    public void end() {
        
    }

    @Override
    public boolean finished() {
        return true;
    }

}
