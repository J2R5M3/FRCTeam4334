package com.jointhealliance.rumble.main;

import com.jointhealliance.rumble.debug.Ex.NoTarget;


/**
 * Main class of the port.
 * 
 * @author Joel Gallant
 */
public class MainClass {

    public static void main(String[] args) throws InterruptedException, NoTarget  {
        Interface interface1 = new Interface();
        interface1.setVisible(true);
        Interface.modes.robotInit();
    }
}
