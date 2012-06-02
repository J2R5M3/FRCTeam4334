package com.jointhealliance.rumble.settings;

import java.util.Arrays;
import com.jointhealliance.rumble.debug.Ex;
import com.jointhealliance.rumble.debug.Ex.NoTarget;

/**
 *
 * @author Joel Gallant
 */
public class SavedValues {
    private static String[] m_Names;
    
    /**
     * @deprecated 
     */
    private static double lagCompensation;
    /**
     * @deprecated 
     * @return 
     */
    public static double getLagCompensation() {
        return lagCompensation;
    }
    /**
     * @param value 
     * @deprecated 
     */
    public static void setLagCompensation(double value) {
        lagCompensation = value;
    }
    
    public static void init() {
        //Init default values
        lagCompensation = 1.0;
    }
    
    public static void save() {
        //Insert code to check the satus of all preferences
        //Preferences.getInstance().save();
    }
    
    @SuppressWarnings("unused")
	private static void newID(String name) {
        if(name == null) {
            try {
                throw new Ex.NoTarget("New ID for null name");
            } catch (NoTarget ex) {
                ex.printTrace();
            }
        }
        if(m_Names != null) {
            String[] temp = m_Names.clone();
            m_Names = new String[temp.length+1];
            System.arraycopy(temp, 0, m_Names, 0, temp.length);
        }else {
            m_Names = new String[1];
        }
        m_Names[m_Names.length-1] = name;
    }
    
    public static int getInt(String ID) throws NoTarget {
        if(Arrays.binarySearch(m_Names, ID) == 0) {
            return 0; //Preferences...
        }else {
            throw new Ex.NoTarget("No object under that ID");
        }
    }
    
    public static void putInt(String ID, int i) {
        if(Arrays.binarySearch(m_Names, ID) == 0) {
            
        }else {
            //Preferences.getInstance.putInt(ID, i);
        }
        save();
    }
    
    public static double getDouble(String ID) throws NoTarget {
        if(Arrays.binarySearch(m_Names, ID) == 0) {
            return 0; //Preferences...
        }else {
            throw new Ex.NoTarget("No object under that ID");
        }
    }
    
    public static void putDouble(String ID, double d) {
        if(Arrays.binarySearch(m_Names, ID) == 0) {
            
        }else {
            //Preferences.getInstance.putDouble(ID, d);
        }
        save();
    }
    
    public static String getString(String ID) throws NoTarget {
        if(Arrays.binarySearch(m_Names, ID) == 0) {
            return null; //Preferences...
        }else {
            throw new Ex.NoTarget("No object under that ID");
        }
    }

    public static void putString(String ID, String s) {
        if(Arrays.binarySearch(m_Names, ID) == 0) {
            
        }else {
            //Preferences.getInstance.putString(ID, s);
        }
        save();
    }
    
}
