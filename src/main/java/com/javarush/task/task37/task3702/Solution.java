package com.javarush.task.task37.task3702;

import com.javarush.task.task37.task3702.female.FemaleFactory;
import com.javarush.task.task37.task3702.male.MaleFactory;

public class Solution {
    public static void main(String[] args) {
        MaleFactory maleFactory = new MaleFactory();
        System.out.println(maleFactory.getPerson(99));
        System.out.println(maleFactory.getPerson(4));
        System.out.println(maleFactory.getPerson(15));

        System.out.println("______________________________");

        FemaleFactory femaleFactory = new FemaleFactory();
        System.out.println(femaleFactory.getPerson(99));
        System.out.println(femaleFactory.getPerson(4));
        System.out.println(femaleFactory.getPerson(15));

        System.out.println("______________________________");

        AbstractFactory abstractMaleFactory = FactoryProducer.getFactory(FactoryProducer.HumanFactoryType.MALE);
        System.out.println(abstractMaleFactory.getPerson(99));
        System.out.println(abstractMaleFactory.getPerson(4));
        System.out.println(abstractMaleFactory.getPerson(15));

        System.out.println("______________________________");

        AbstractFactory abstractFemaleFactory = FactoryProducer.getFactory(FactoryProducer.HumanFactoryType.FEMALE);
        System.out.println(abstractFemaleFactory.getPerson(99));
        System.out.println(abstractFemaleFactory.getPerson(4));
        System.out.println(abstractFemaleFactory.getPerson(15));
    }
}
