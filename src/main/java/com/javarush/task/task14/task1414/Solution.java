package com.javarush.task.task14.task1414;

/*
MovieFactory
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7

        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

        Scanner in = new Scanner(System.in);
        while(true){
            String str = in.nextLine();
            if(!(str.equals("soapOpera") || str.equals("cartoon") || str.equals("thriller"))) {
                MovieFactory.getMovie(str);
                break;
            }
            System.out.println(MovieFactory.getMovie(str).getClass().getSimpleName());
        }

    }

    static class MovieFactory {

        static Movie getMovie(String key) {

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key))
                return new SoapOpera();
            else if("cartoon".equals(key))
                return new Cartoon();
            else if("thriller".equals(key))
                return new Thriller();

            //напишите тут ваш код, пункты 5,6

            return null;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie{

    }

    static class Thriller extends Movie{

    }

    //Напишите тут ваши классы, пункт 3
}