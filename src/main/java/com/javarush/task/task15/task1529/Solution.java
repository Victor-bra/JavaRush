package com.javarush.task.task15.task1529;

/*
Осваивание статического блока
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

    }

    static {
        //add your code here - добавьте код тут
        reset();
    }

    public static CanFly result;

    public static void reset() {
        //add your code here - добавьте код тут
        try (Scanner in = new Scanner(System.in)) {
            String str = in.nextLine();
            if (str.equalsIgnoreCase("helicopter"))
                result = new Helicopter();
            else if (str.equalsIgnoreCase("plane"))
                result = new Plane(in.nextInt());
        }
    }
}