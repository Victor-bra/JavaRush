package com.javarush.task.task18.task1801;

/*
Максимальный байт
*/

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        try (FileInputStream inputStream = new FileInputStream(new Scanner(System.in).nextLine())) {
            int x = Integer.MIN_VALUE;
            while (inputStream.available() > 0) {
                int byte1;
                if ((byte1 = inputStream.read()) > x)
                    x = byte1;
            }
            System.out.println(x);
        }
    }
}