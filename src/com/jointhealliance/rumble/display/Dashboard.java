package com.jointhealliance.rumble.display;

import com.jointhealliance.rumble.debug.Base;
import com.jointhealliance.rumble.main.Interface;

/**
 * 
 * 
 * @author Joel Gallant
 */
public class Dashboard {
    public static void init() {
        try {
            Interface.Alliance.setText(Base.getAllianceName()+" alliance number "+Base.getAllianceLocation());
            Interface.Team.setText("Team: "+Base.getTeamNumber());
        } catch(NullPointerException ex) {
        }
    }
    public static void update() {
        try {
            Interface.GameTime.setText("Time: "+Base.getMatchTime());
            Interface.Mode.setText("Period: "+Base.getGamePeriod());
        } catch(NullPointerException ex) {}
    }
}
