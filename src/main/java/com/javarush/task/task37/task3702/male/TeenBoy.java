package com.javarush.task.task37.task3702.male;

import com.javarush.task.task37.task3702.Human;

public class TeenBoy implements Human {
    public final int MAX_AGE = 19;

    @Override
    public String toString() {
        return "TeenBoy{" +
                "MAX_AGE=" + MAX_AGE +
                '}';
    }
}
