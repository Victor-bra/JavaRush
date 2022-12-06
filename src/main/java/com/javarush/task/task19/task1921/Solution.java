package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/*
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        if(args.length == 0)
            throw new RuntimeException();
        List<String> linesInFile = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(args[0]))){
            while (reader.ready())
                linesInFile.add(reader.readLine());
        }

        for(String line: linesInFile){
            String[] str = line.split(" ");
            int day = Integer.parseInt(str[str.length-3]);
            int month = Integer.parseInt(str[str.length-2])-1;
            int year = Integer.parseInt(str[str.length-1]);
            str[str.length-1] = null;
            str[str.length-2] = null;
            str[str.length-3] = null;


            String name = "";
            for(int i = 0; i< str.length;i++){
                if(str[i]!= null){
                    if(str[i+1]!= null)
                        name+=str[i] + " ";
                    else
                        name+=str[i];
                } else
                    break;
            }
            Calendar calendar = new GregorianCalendar(year, month,day);
            PEOPLE.add(new Person(name, calendar.getTime()));
        }
        //PEOPLE.stream().forEach(c -> System.out.println(c.toString()));
    }
}