package com.javarush.task.task32.task3210;

/*
Используем RandomAccessFile
*/

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Solution {
    public static void main(String... args) {
        String fileName = args[0];
        long number = Long.parseLong(args[1]);
        String text = args[2];

        try(RandomAccessFile accessFile = new RandomAccessFile(fileName, "rw")){
            accessFile.seek(number);
            byte[] readText = new byte[text.length()];
            accessFile.read(readText, 0,text.length());

            String text2 = new String(readText);

            accessFile.seek(accessFile.length());
            if(text2.equals(text))
                accessFile.write("true".getBytes());
            else
                accessFile.write("false".getBytes());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}