package com.javarush.task.task37.task3711;

public class Computer {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void run(){
        this.cpu.calculate();
        this.memory.allocate();
        this.hardDrive.storeData();
    }
}
