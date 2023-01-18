package com.javarush.task.task30.task3004;

import java.util.concurrent.RecursiveTask;

public class BinaryRepresentationTask extends RecursiveTask<String> {
    private final int i;

    public BinaryRepresentationTask(int i) {
        this.i = i;
    }

    @Override
    protected String compute() {
        int a = i%2;
        int b = i/2;
        if(b>0){
            BinaryRepresentationTask representationTask = new BinaryRepresentationTask(b);
            representationTask.join();
            return representationTask.join()+a;
        }
        return String.valueOf(a);
    }
}
