package com.javarush.task.pro.task12.task1206;

/* 
Анализ строк
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        //напишите тут ваш код
        int x=0;
        char[] str = string.toCharArray();
        for(Character ch: str){
            if(Character.isDigit(ch))
                x++;
        }
        return x;
    }

    public static int countLetters(String string) {
        //напишите тут ваш код
        int x=0;
        char[] str = string.toCharArray();
        for(Character ch: str){
            if(Character.isLetter(ch))
                x++;
        }
        return x;
    }

    public static int countSpaces(String string) {
        //напишите тут ваш код
        int x=0;
        char[] str = string.toCharArray();
        for(Character ch: str){
            if(Character.isSpaceChar(ch))
                x++;
        }
        return x;
    }
}