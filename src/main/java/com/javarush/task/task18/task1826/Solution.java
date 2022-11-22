package com.javarush.task.task18.task1826;

/*
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args[0] == null || args[1] == null || args[2] == null)
            throw new Exception();
        switch (args[0]) {
            case "-e":
                try (FileInputStream inputStream = new FileInputStream(args[1]);
                     FileOutputStream outputStream = new FileOutputStream(args[2])) {
                    while (inputStream.available() > 0) {
                        int byteNumber = inputStream.read() + 1;
                        outputStream.write(byteNumber);
                    }
                }
                break;
            case "-d":
                try (FileInputStream inputStream = new FileInputStream(args[1]);
                     FileOutputStream outputStream = new FileOutputStream(args[2])) {
                    while (inputStream.available() > 0) {
                        int byteNumber = inputStream.read() - 1;
                        outputStream.write(byteNumber);
                    }
                }
                break;
        }
    }
}