package org.brush.command;

public class DelayedTyper implements Command {
    private long itsDelay;
    private char itsChar;

    public DelayedTyper(long itsDelay, char itsChar) {
        this.itsDelay = itsDelay;
        this.itsChar = itsChar;
    }

    private static ActiveObjectEngine engine =new ActiveObjectEngine();
    private static boolean stop = false;
    public static void main(String[] args)
    {
        engine.addCommand(new DelayedTyper(100, '1'));
        engine.addCommand(new DelayedTyper(300,'3'));
        engine.addCommand(new DelayedTyper(500,'5'));
        engine.addCommand(new DelayedTyper(700,'7'));

        Command stopCommand =new Command() {

            public void execute() throws Exception {
                stop = true;
            }
        };
        engine.addCommand(new SleepCommand(stopCommand,engine,20000));
        engine.run();
    }
    public void execute() throws Exception {
        System.out.println(itsChar);
        if(!stop)
            delayAndRepeat();
    }

    private void delayAndRepeat() throws CloneNotSupportedException{
        engine.addCommand(new SleepCommand(this,engine,itsDelay));
    }


}
