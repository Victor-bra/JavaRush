package com.javarush.task.task18.task1820;

/*
Округление чисел
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        ArrayList<String> numberStrings = new ArrayList<>();
        ArrayList<Integer> numberInts = new ArrayList<>();
        try (FileInputStream inputStream = new FileInputStream(in.nextLine());
             FileOutputStream outputStream = new FileOutputStream(in.nextLine())) {
            String str = "";
            while (inputStream.available() > 0) {
                int x = inputStream.read();
                if (x == 32) {
                    numberStrings.add(str);
                    str = "";
                } else {
                    str += (char) x;
                }
            }
            numberStrings.add(str);

            for (String numberString : numberStrings)
                numberInts.add((int) Math.round(Double.parseDouble(numberString)));
            /*System.out.println(numberStrings);
            System.out.println(numberInts);*/
            for (int i = 0; i < numberInts.size(); i++) {
                outputStream.write(numberInts.get(i).toString().getBytes());
                if (i != numberInts.size() - 1)
                    outputStream.write(32);
            }

        }
    }
}