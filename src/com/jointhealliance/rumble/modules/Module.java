package com.jointhealliance.rumble.modules;

/**
 * Extendable module.
 * 
 * @author Joel Gallant
 */
public abstract class Module {
    private static String[] kModules;
    public static String[] getModules() {
        return kModules;
    }
    public Module(String m) {
        if(kModules != null) {
            String[] temp = kModules;
            int length = kModules.length;
            kModules = new String[length+1];
            System.arraycopy(temp, 0, kModules, 0, temp.length);
            kModules[kModules.length-1] = m;
        }else {
            kModules = new String[1];
            kModules[0] = m;
        }
    }
    public abstract void enable();
    public abstract boolean getEnabled();
    public abstract void disable();
    public abstract void reset();
}
