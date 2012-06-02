package com.jointhealliance.rumble.commands.modes;

import com.jointhealliance.rumble.commandbase.Mode;
import com.jointhealliance.rumble.commands.groups.ExampleGroup;

/**
 * Example mode used for testing purposes.
 * 
 * @author Joel Gallant
 */
public final class ExampleMode extends Mode{
    public ExampleMode() {
        addGroup(new ExampleGroup());
    }
}
