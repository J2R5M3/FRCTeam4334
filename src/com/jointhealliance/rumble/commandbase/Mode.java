package com.jointhealliance.rumble.commandbase;

/**
 * Mode usable in any game mode. Modes encompass a variety of command m_groups and commands.
 * 
 * <p> Generally, modes should be very specific in purpose. If there are specific variables
 * that should be used to implement the mode differently, pass them through the constructor.
 * 
 * @author Joel Gallant
 */
public class Mode extends CommandBase{
    /**
     * Array of m_groups run by CommandBase.
     */
    public Group[] m_groups;
    
    /**
     * Adds a group to the m_groups array that will be run by CommandBase.
     * 
     * @param g Group to add.
     */
    public final synchronized void addGroup(Group g) {
        if(g != null) {
            if(m_groups != null) {
                Group[] temp = m_groups.clone();
                m_groups = new Group[temp.length+1];
                System.arraycopy(temp, 0, m_groups, 0, temp.length);
            }else {
                m_groups = new Group[1];
            }
            m_groups[m_groups.length-1] = g;
        }
    }
    /**
     * Adds a command to the array of m_groups by making that command its own group.
     * 
     * @param c Command to add.
     */
    public final synchronized void addCommand(Command c) {
        if(c != null) {
            if(m_groups != null) {
                Group[] temp = m_groups.clone();
                m_groups = new Group[temp.length+1];
                System.arraycopy(temp, 0, m_groups, 0, temp.length);
            }else {
                m_groups = new Group[1];
            }
            m_groups[m_groups.length-1] = new Group();
            m_groups[m_groups.length-1].addCommand(c);
        }
    }
}
