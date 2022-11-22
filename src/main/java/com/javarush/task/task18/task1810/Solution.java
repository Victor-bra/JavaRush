package com.javarush.task.task18.task1810;

/*
DownloadException
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws DownloadException {
        while (true) {
            try (FileInputStream inputStream = new FileInputStream(new Scanner(System.in).nextLine())) {
                if (inputStream.available() < 1000)
                    throw new DownloadException();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}