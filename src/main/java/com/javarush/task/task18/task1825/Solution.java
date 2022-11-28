package com.javarush.task.task18.task1825;

/*
Собираем файл
*/

import java.io.*;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<String> files = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] parts1 = o1.split(".part");
                String[] parts2 = o2.split(".part");
                int number1 = Integer.parseInt(parts1[parts1.length-1]);
                int number2 = Integer.parseInt(parts2[parts2.length-1]);
                return number1 - number2;
            }
        });

        String outputFile = null;
        String readString;
        while (!(readString = reader.readLine()).equals("end")) {
            files.add(readString);
            if (outputFile == null) {
                int indexOfSuffix = readString.lastIndexOf(".part");
                outputFile = readString.substring(0, indexOfSuffix);
            }
        }

        if (outputFile == null)
            return;
        try (FileOutputStream outputStream = new FileOutputStream(outputFile)) {
            for (String file : files) {
                try (FileInputStream inputStream = new FileInputStream(file)) {
                    byte[] buffer = new byte[inputStream.available()];
                    while (inputStream.available() > 0) {
                        int bytesRead = inputStream.read(buffer);
                        outputStream.write(buffer, 0, bytesRead);
                    }
                }
            }
        }
    }
}