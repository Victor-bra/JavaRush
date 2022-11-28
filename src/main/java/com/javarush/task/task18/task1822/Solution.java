package com.javarush.task.task18.task1822;

/*
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(new Scanner(System.in).nextLine()))) {
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                if (str.startsWith(args[0] + " ")) {
                    System.out.println(str);
                    break;
                }
            }
        }
    }
}