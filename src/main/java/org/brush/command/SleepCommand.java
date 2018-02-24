package org.brush.command;

public class SleepCommand implements Command {
    private Command warkupCommand=null;
    private ActiveObjectEngine engine=null;
    private long sleepTime = 0;
    private long startTime = 0;
    private volatile boolean started =false;

    public SleepCommand(Command warkupCommand, ActiveObjectEngine engine, long sleepTime) {
        this.warkupCommand = warkupCommand;
        this.engine = engine;
        this.sleepTime = sleepTime;
    }

    public void execute() {

        long cuurentTime = System.currentTimeMillis();
       synchronized(this){
            if(!started)
            {
                started=true;
                startTime=cuurentTime;
                engine.addCommand(this);
            }else if ((cuurentTime-startTime)<sleepTime)
            {
                engine.addCommand(this);
            }else
            {
                engine.addCommand(warkupCommand);
            }
        }


    }
}
