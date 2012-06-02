package com.jointhealliance.rumble.commands.groups;

import com.jointhealliance.rumble.commandbase.Group;
import com.jointhealliance.rumble.commands.ExampleCommand;

/**
 * Example group used for testing purposes.
 * 
 * @author Joel Gallant
 */
public final class ExampleGroup extends Group{
    public ExampleGroup() {
        addCommand(new ExampleCommand(null));
    }
}
