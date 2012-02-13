/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

public class RobotTimer extends Robot4334 {
    
    public double timerControl(String args) {
        
        double time = 0;
        
        if(args.equals("stopAndReset")) {
            timer.start();
            timer.reset();     
        } else if(args.equals("start")) {
            timer.start();
        } else if(args.equals("stopAndReset")) {
            timer.stop();
            timer.reset();
        } else if(args.equals("getTimer")) {
            time = timer.get();
        } else if (args.equals("getAndLoopTimer")) {
             time = timer.get();
             timer.stop();
             timer.reset();
             timer.start();
        }
        return time;
            
    }

}