package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        //напишите тут ваш код
        String number = null;
        String paramSubString = url.substring(url.lastIndexOf("?") + 1);
        String[] massParam = paramSubString.split("&");
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : massParam) {
            String[] str2 = str.split("=");
            stringBuilder.append(str2[0] + " ");
            if (str2[0].equalsIgnoreCase("obj"))
                number = str2[1];
        }

        System.out.println(stringBuilder);
        if(number!= null){
            try {
                alert(Double.parseDouble(number));
            } catch (NumberFormatException e) {
                alert(number);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}