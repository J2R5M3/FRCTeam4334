package com.jointhealliance.rumble.commandbase;

import com.jointhealliance.rumble.debug.Ex;
import com.jointhealliance.rumble.debug.Ex.NoTarget;

/**
 * Extendable command base used for both creating a base for all type of m_commands
 * and for running those m_commands.
 * 
 * <p> Contains a queue of m_commands separate from the currently running m_commands.
 * 
 * @author Joel Gallant
 */
public class CommandBase {
    private static CommandBase kInstance;
    private static Command kCurrentlyRunning;
    private static boolean kRunning = false;
    private static CommandBase[] kQueue;
    
    /**
     * Returns a singleton instance of {@link CommandBase}.
     * 
     * @return The singleton instance of command base for use.
     */
    public static synchronized CommandBase getInstance() {
        if(kInstance == null) {
            kInstance = new CommandBase();
        }
        return kInstance;
    }
    
    /**
     * Runs any command that extends CommandBase, Command, Group or Mode.
     * 
     * @param command Command to run
     */
    public final synchronized void run(CommandBase command) {
        kRunning = true;
        if(command instanceof Mode) {
            runMode((Mode)command);
        }else if(command instanceof Group) {
            runGroup((Group)command);
        }else if(command instanceof Command) {
            runCommand((Command)command);
        }else {
            throw new Ex.SoftwareError("Command run that was not an instance of mode, group or command");
        }
        kRunning = false;
    }
    
    /**
     * Runs an array of CommandBase based objects.
     * 
     * @param commands Command array to run
     * @throws com.jointhealliance.rumble.debug.Ex.NoTarget
     */
    public final synchronized void run(CommandBase[] commands) throws NoTarget {
        if(commands != null) {
            for(int x = 0; x < commands.length; x++) {
                run(commands[x]);
            }
        }else {
            throw new Ex.NoTarget("Null command array run");
        }
    }
    
    /**
     * Adds a CommandBase based command to the queue.
     * 
     * @param command Command to add to the queue
     * @throws com.jointhealliance.rumble.debug.Ex.NoTarget
     */
    public final synchronized void addToQueue(CommandBase command) throws NoTarget {
        if(command != null) {
            if(kQueue != null) {
                CommandBase[] temp = kQueue.clone();
                kQueue = new CommandBase[temp.length+1];
                System.arraycopy(temp, 0, kQueue, 0, temp.length);
            }else {
                kQueue = new CommandBase[1];
            }
            kQueue[kQueue.length-1] = command;
        }else {
            throw new Ex.NoTarget("Null command added to queue");
        }
    }
    
    /**
     * Adds a CommandBase based command array to the queue.
     * 
     * @param commands Command array to add to the queue
     * @throws com.jointhealliance.rumble.debug.Ex.NoTarget
     */
    public final synchronized void addToQueue(CommandBase[] commands) throws NoTarget {
        if(commands != null) {
            for(int x = 0; x < commands.length; x++) {
                addToQueue(commands[x]);
            }
        }else {
            throw new Ex.NoTarget("Null command array added to queue");
        }
    }
    
    /**
     * Removes all m_commands that are currently in the queue.
     */
    public final synchronized void deleteQueue() {
        kQueue = null;
    }
    
    /**
     * Runs the saved queue.
     */
    public final synchronized void runQueue() {
        if(kQueue != null) { 
            try {
                run(kQueue);
            } catch (NoTarget ex) {
                ex.printTrace();
            }
        }else {
            try {
                throw new Ex.NoTarget("Null queue run");
            } catch (NoTarget ex) {
                ex.printTrace();
            }
        }
    }
    
    /**
     * Returns if it is currently running. This method is not very reliable as
     * m_commands run very quickly through the command base and the currently running
     * variable is continuously changing. (Along with it being volatile, which makes it
     * nearly impossible to actually return it during the run sequence.
     * 
     * @deprecated 
     * @return If there is a command currently running.
     */
    public final boolean isRunning() {
        return kRunning;
    }
    
    /**
     * Returns the currently running command. This method is not very reliable as
     * m_commands run very quickly through the command base and the currently running
     * object is continuously changing. (Along with it being volatile, which makes it
     * nearly impossible to actually return it during the run sequence.
     * 
     * @deprecated 
     * @return The currently running command.
     */
    public final synchronized Command getCurrentlyRunning() {
        return kCurrentlyRunning;
    }
    
    private synchronized void runMode(Mode m) {
        if(m != null && m.m_groups != null) {
            for(int x = 0; x < m.m_groups.length; x++) {
                runGroup(m.m_groups[x]);
            }
        }else {
            try {
                throw new Ex.NoTarget("Null mode run");
            } catch (NoTarget ex) {
                ex.printTrace();
            }
        }
    }
    private synchronized void runGroup(Group g) {
        if(g != null && g.m_commands != null) {
            for(int x = 0; x < g.m_commands.length; x++) {
                runCommand(g.m_commands[x]);
            }
        }else {
            try {
                throw new Ex.NoTarget("Null group run");
            } catch (NoTarget ex) {
                ex.printTrace();
            }
        }
    }
    private synchronized void runCommand(final Command c) {
        kCurrentlyRunning = c;
        if(c != null) {
            
                c.run();
            
        }else {
            try {
                throw new Ex.NoTarget("Null command run");
            }catch(Ex.NoTarget ex) {
                ex.printTrace();
            }
        }
        kCurrentlyRunning = null;
    }
}
