package com.javarush.task.task36.task3601;

public class Controller {
    public void fireShowDataEvent() {
        View view = new View();
        System.out.println(view.onShowDataList());
    }
}
