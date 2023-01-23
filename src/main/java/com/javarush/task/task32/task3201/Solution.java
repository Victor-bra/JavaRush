package com.javarush.task.task32.task3201;

/*
Запись в существующий файл
*/

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Solution {
    public static void main(String... args) {
        String fileName = args[0];
        long number = Long.parseLong(args[1]);
        String text = args[2];
        try(RandomAccessFile accessFile = new RandomAccessFile(fileName,"rw")){
            number = number>accessFile.length()?accessFile.length():number;
            accessFile.seek(number);
            accessFile.write(text.getBytes());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}