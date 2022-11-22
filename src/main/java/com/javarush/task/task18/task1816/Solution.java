package com.javarush.task.task18.task1816;

/*
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        int summa = 0;
        try (FileInputStream inputStream = new FileInputStream(args[0])) {
            while (inputStream.available() > 0) {
                int chars = inputStream.read();
                if ((chars >= 65 && chars <= 90) || (chars >= 97 && chars <= 122))
                    summa++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(summa);
    }
}