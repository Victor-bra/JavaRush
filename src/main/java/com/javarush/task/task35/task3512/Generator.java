package com.javarush.task.task35.task3512;

public class Generator<T> {
    private Class<T> x;

    public Generator(Class<T> x) {
        this.x = x;
    }

    T newInstance() throws InstantiationException, IllegalAccessException {
        return x.newInstance();
    }
}