package com.javarush.task.task19.task1904;

/*
И еще один адаптер
*/

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {

        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String inputString = fileScanner.nextLine();
            String[] subInputString = inputString.split(" ");
            Calendar calendar = new GregorianCalendar(Integer.parseInt(subInputString[5]), Integer.parseInt(subInputString[4]) - 1, Integer.parseInt(subInputString[3]));
            return new Person(subInputString[1], subInputString[2], subInputString[0], calendar.getTime());
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}