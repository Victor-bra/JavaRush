package com.javarush.task.task22.task2211;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/*
Смена кодировки
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (FileInputStream inputStream = new FileInputStream(args[0]);
             FileOutputStream outputStream = new FileOutputStream(args[1])) {
            Charset win1251 = Charset.forName("Windows-1251");
            Charset utf8 = Charset.forName("UTF-8");
            byte[] buffered = new byte[inputStream.available()];
            inputStream.read(buffered, 0, buffered.length);
            String s = new String(buffered, win1251);
            buffered = s.getBytes(utf8);
            outputStream.write(buffered);
        }
    }
}