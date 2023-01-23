package com.javarush.task.task32.task3204;

import java.io.ByteArrayOutputStream;

/*
Генератор паролей
*/

public class Solution {
    public static int number = 0, upperChar = 0, lowChar = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            number = 0;
            upperChar = 0;
            lowChar = 0;
            ByteArrayOutputStream password = getPassword();
            System.out.println(password.toString());
        }
    }

    public static ByteArrayOutputStream getPassword() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        for (int i = 0; i < 8; i++) {
            int numberSymbolForGenerate = generateSymbol(1, 3);
            int ASCIISymbol = 0;
            if (i >= 5 && (number == 0 || upperChar == 0 || lowChar == 0)) {
                if (number == 0) {
                    number++;
                    ASCIISymbol = generateSymbol(48, 57);
                } else if (upperChar == 0) {
                    upperChar++;
                    ASCIISymbol = generateSymbol(65, 90);
                } else if (lowChar == 0) {
                    lowChar++;
                    ASCIISymbol = generateSymbol(97, 122);
                }
            } else {
                ASCIISymbol = getASCIISymbol(numberSymbolForGenerate);
            }
            outputStream.write(ASCIISymbol);
        }
        return outputStream;
    }

    private static int getASCIISymbol(int numberSymbolForGenerate) {
        switch (numberSymbolForGenerate) {
            case 1:
                number++;
                return generateSymbol(48, 57);
            case 2:
                upperChar++;
                return generateSymbol(65, 90);
            case 3:
                lowChar++;
                return generateSymbol(97, 122);
            default:
                return 0;
        }
    }

    private static int generateSymbol(int start, int end) {
        return (int) (start + Math.random() * ((end - start) + 1));
    }
}