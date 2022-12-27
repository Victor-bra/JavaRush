package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread{
    private Thread thread;

    public LoggingStateThread(Thread thread){
        this.thread = thread;
        super.setDaemon(true);
    }

    @Override
    public void run() {
        State state = thread.getState();
        System.out.println(state);

        State newState;
        while(!state.equals(State.TERMINATED)){
            newState = thread.getState();
            if(newState!=state){
                state=newState;
                System.out.println(state);
            }
        }
    }
}
