package com.javarush.task.task19.task1907;

/*
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    private static int count = 0;

    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             FileReader fileReader = new FileReader(bufferedReader.readLine())) {
            String str = "";
            while (fileReader.ready()) {
                str += (char) fileReader.read();
            }
            String newString = str.toString().replaceAll("\\p{P}", " ").replaceAll("\\s", " ");
            for (String s : newString.split(" ")) {
                if (s.equals("world"))
                    count++;
            }
            System.out.println(count);
        }
    }
}