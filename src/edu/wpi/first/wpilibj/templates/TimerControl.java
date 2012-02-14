package edu.wpi.first.wpilibj.templates;
import edu.wpi.first.wpilibj.Timer;
public class TimerControl extends Robot{
    
    public Timer timer;
    
    public void init() {
        timer = new Timer();
    }
    public double timerControl(String args) {
        if(args.equals("start"))
            timer.start();
        else if(args.equals("stop"))
            timer.stop();
        else if(args.equals("stopAndRestart")) {
            timer.stop();
            timer.reset();
            timer.start();
        }
        else if(args.equals("get")) {
            processInformation.finalTime = timer.get();
            return processInformation.finalTime;
        }
        else if(args.equals("getResetAndStart")) {
            processInformation.finalTime = timer.get();
            timer.reset();
            timer.start();
        }
        else if(args.equals("stopAndReset")) {
            timer.stop();
            timer.reset();
        }
        else 
            processInformation.finalTime = 0;
        return processInformation.finalTime;
    }
}
