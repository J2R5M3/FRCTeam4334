package com.jointhealliance.rumble.modules;

/**
 *
 * @author Joel Gallant
 */
public class ExampleModule extends Module{
    
    private static ExampleModule kInstance;
    
    public ExampleModule(String name) {
        super(name);
    }

    public static Module getInstance() {
        if(kInstance == null) {
            kInstance = new ExampleModule("ExampleModule");
        }
        return kInstance;
    }

    private boolean enabled = false;
    
    @Override
    public void enable() {
        enabled = true;
    }

    @Override
    public void disable() {
        enabled = false;
    }

    @Override
    public void reset() {
        enabled = false;
        
        enabled = true;
    }
    
    public void exampleMethod() {
        if(enabled) { // Always do this.
            
        }
    }

    @Override
    public boolean getEnabled() {
        return enabled;
    }

}
