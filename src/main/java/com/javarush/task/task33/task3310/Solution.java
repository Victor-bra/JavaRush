package com.javarush.task.task33.task3310;

import com.javarush.task.task33.task3310.strategy.HashMapStorageStrategy;
import com.javarush.task.task33.task3310.strategy.OurHashMapStorageStrategy;
import com.javarush.task.task33.task3310.strategy.StorageStrategy;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        testStrategy(new HashMapStorageStrategy(), 10000);

        testStrategy(new OurHashMapStorageStrategy(), 10000);
    }

    public static Set<Long> getIds(Shortener shortener, Set<String> strings) {
        Set<Long> getIds = new HashSet<>();
        for (String string : strings)
            getIds.add(shortener.getId(string));
        return getIds;
    }

    public static Set<String> getStrings(Shortener shortener, Set<Long> keys) {
        Set<String> getStings = new HashSet<>();
        for (Long long_i : keys)
            getStings.add(shortener.getString(long_i));
        return getStings;
    }

    public static void testStrategy(StorageStrategy strategy, long elementNumber) {
        Helper.printMessage(strategy.getClass().getSimpleName() + ":");

        Set<String> testString = new HashSet<>();
        for (int i = 0; i < elementNumber; i++)
            testString.add(Helper.generateRandomString());

        Shortener shortener = new Shortener(strategy);

        Date startTimes = new Date();
        Set<Long> keys = getIds(shortener, testString);
        Date endTimes = new Date();
        long timeKeys = endTimes.getTime() - startTimes.getTime();
        Helper.printMessage("Время получения строк для " + elementNumber + " :" + timeKeys);

        startTimes = new Date();
        Set<String> stings = getStrings(shortener, keys);
        endTimes = new Date();
        long timeString = endTimes.getTime() - startTimes.getTime();
        Helper.printMessage("Время получения строк для " + elementNumber + " :" + timeKeys);

        if (testString.equals(stings))
            Helper.printMessage("Тест пройден.");
        else
            Helper.printMessage("Тест не пройден.");

        Helper.printMessage("");
    }
}
