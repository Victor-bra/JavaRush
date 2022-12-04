package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;/*
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();

        String[] str = outputStream.toString().split(" ");

        System.setOut(consoleStream);
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[2]);
        if (str[1].equals("+"))
            System.out.printf("%d + %d = %d%n", a, b, a + b);
        if (str[1].equals("-"))
            System.out.printf("%d - %d = %d%n", a, b, a - b);
        if (str[1].equals("*"))
            System.out.printf("%d * %d = %d%n", a, b, a * b);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}