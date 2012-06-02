package com.jointhealliance.rumble.commandbase;

/**
 * Command group usable in teleop and autonomous. Runs on main thread with CommandBase.run(Command).
 * 
 * <p> Generally, groups should encompass either a very specific array of m_commands that is 
 * only useful in specific situations, or very general in purpose so that it can be used
 * for testing purposes, general purpose m_commands (With joystick, etc.) or just for wide 
 * use around the entire code. If there are specific variables that should be used to 
 * implement the group differently, pass them through the constructor.
 * 
 * @author Joel Gallant
 */
public class Group extends CommandBase{
    /**
     * Array of command that are part of the group.
     */
    public Command[] m_commands;
    
    /**
     * Adds a command to the m_commands array to be run by CommandBase.
     * 
     * @param c Command to be added.
     */
    public final synchronized void addCommand(Command c) {
        if(m_commands != null) {
            Command[] temp = m_commands.clone();
            m_commands = new Command[temp.length+1];
            System.arraycopy(temp, 0, m_commands, 0, temp.length);
        }else {
            m_commands = new Command[1];
        }
        m_commands[m_commands.length-1] = c;
    }
}
