package com.javarush.task.task18.task1818;

/*
Два в одном
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try(FileOutputStream outputStream = new FileOutputStream(in.nextLine(), true);
            FileInputStream inputStream1 = new FileInputStream(in.nextLine());
            FileInputStream inputStream2 = new FileInputStream(in.nextLine())) {
            while (inputStream1.available()>0)
                outputStream.write(inputStream1.read());
            while (inputStream2.available()>0)
                outputStream.write(inputStream2.read());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}