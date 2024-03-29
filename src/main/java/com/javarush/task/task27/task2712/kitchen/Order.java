package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.ConsoleHelper;
import com.javarush.task.task27.task2712.Tablet;

import java.io.IOException;
import java.util.List;

public class Order {
    private final Tablet tablet;
    protected List<Dish> dishes;

    public Order(Tablet tablet) throws IOException {
        this.tablet = tablet;
        dishes = ConsoleHelper.getAllDishesForOrder();
        ConsoleHelper.writeMessage(toString());
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public Tablet getTablet() {
        return tablet;
    }

    //Время приготовления заказов
    public int getTotalCookingTime() {
        int timeCooking = 0;
        for (Dish dish : dishes)
            timeCooking += dish.getDuration();
        return timeCooking;
    }

    //Проверка наличия заказов
    public boolean isEmpty() {
        return dishes.isEmpty();
    }

    @Override
    public String toString() {
        if (dishes.size() == 0) return "";
        String result = "Your order: [" + dishes.get(0);
        for (int i = 1; i < dishes.size(); i++) {
            result += ", " + dishes.get(i).name();
        }
        result += "] of " + tablet +
                ", cooking time + " + getTotalCookingTime() + "min";
        return result;
    }
}
