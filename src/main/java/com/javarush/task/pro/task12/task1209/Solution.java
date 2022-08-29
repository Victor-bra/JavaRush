package com.javarush.task.pro.task12.task1209;

import java.util.ArrayList;

/*
Бухгалтерия
*/

public class Solution {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }

    public static void main(String[] args) {
        System.out.println(waitingEmployees.toString());
        initEmployees();
        paySalary("Иногрим");
        System.out.println(waitingEmployees.toString());
        System.out.println(alreadyGotSalaryEmployees.toString());
    }

    public static void paySalary(String name) {
        //напишите тут ваш код
        if (name == null) {
        }
        if (waitingEmployees.contains(name)) {
            int pos = 0;
            for (int i = 0; i < waitingEmployees.size(); i++) {
                if (waitingEmployees.get(i).equals(name)) {
                    pos = i;
                    break;
                }
            }
            alreadyGotSalaryEmployees.add(name);
            waitingEmployees.set(pos, null);
        }

    }
}