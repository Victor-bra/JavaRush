package com.javarush.task.task36.task3601;

import java.util.List;

public class View {
    public List<String> onShowDataList() {
        Model model = new Model();
        return model.getStringDataList();
    }
}
