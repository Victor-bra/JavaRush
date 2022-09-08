package com.javarush.task.pro.task15.task1504;

/*
Перепутанные байты
*/

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        try (Scanner sc = new Scanner(System.in);
             InputStream inputStream = Files.newInputStream(Paths.get(sc.nextLine()));
             OutputStream outputStream = Files.newOutputStream(Paths.get(sc.nextLine()))) {

            byte[] byteIn = inputStream.readAllBytes();
            byte[] byteOut = new byte[byteIn.length];
            for (int i = 0; i < byteIn.length; i += 2) {
                if (i < byteIn.length - 1) {
                    byteOut[i] = byteIn[i + 1];
                    byteOut[i + 1] = byteIn[i];
                } else {
                    byteOut[i] = byteIn[i];
                }
            }
            outputStream.write(byteOut);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}