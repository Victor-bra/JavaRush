package com.javarush.task.task15.task1519;

import java.io.IOException;
import java.util.Scanner;

/*
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        Scanner in = new Scanner(System.in);
        while(true){
            String str = in.nextLine();
            if(str.equalsIgnoreCase("exit"))
                break;
            try {
                if(str.contains("."))
                    print(Double.parseDouble(str));
                else if(Integer.parseInt(str)>0  && Integer.parseInt(str)<128)
                    print(Short.parseShort(str));
                else if(Integer.parseInt(str)<=0 || Integer.parseInt(str)>=128)
                    print(Integer.parseInt(str));
            } catch (Exception e){
                print(str);
            }
        }
        in.close();
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}