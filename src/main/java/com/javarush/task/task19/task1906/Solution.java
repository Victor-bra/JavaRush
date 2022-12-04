package com.javarush.task.task19.task1906;

/*
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             FileReader fileReader = new FileReader(bufferedReader.readLine());
             FileWriter fileWriter = new FileWriter(bufferedReader.readLine())) {
            int x = 1;
            while (fileReader.ready()) {
                if (x % 2 == 0)
                    fileWriter.write(fileReader.read());
                else
                    fileReader.read();
                x++;
            }
        }
    }
}