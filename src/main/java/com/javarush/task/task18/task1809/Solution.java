package com.javarush.task.task18.task1809;

/*
Реверс файла
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream(new Scanner(System.in).nextLine());
             FileOutputStream outputStream = new FileOutputStream(new Scanner(System.in).nextLine())) {
            if (inputStream.available() > 0) {
                byte[] array = new byte[inputStream.available()];
                int count = inputStream.read(array);
                sort(array);
                outputStream.write(array, 0, count);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void sort(byte[] massive) {
        for (int i = 0; i < massive.length / 2; i++) {
            byte tmp = massive[i];
            massive[i] = massive[massive.length - i - 1];
            massive[massive.length - i - 1] = tmp;
        }
    }
}