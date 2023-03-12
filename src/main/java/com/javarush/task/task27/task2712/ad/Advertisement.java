package com.javarush.task.task27.task2712.ad;

//Рекламное объявление
public class Advertisement {
    //Видео
    private Object content;
    //имя/название
    private String name;
    //начальная сумма, стоимость рекламы в копейках
    private long initialAmount;
    //количество оплаченных показов
    private int hits;
    //продолжительность в секундах
    private int duration;
    private long amountPerOneDisplaying;

    public Advertisement(Object content, String name, long initialAmount, int hits, int duration) {
        this.content = content;
        this.name = name;
        this.initialAmount = initialAmount;
        this.hits = hits;
        this.duration = duration;
        if (this.hits > 0)
            this.amountPerOneDisplaying = this.initialAmount / this.hits;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public long getAmountPerOneDisplaying() {
        return amountPerOneDisplaying;
    }

    public void revalidate(){
        if(hits==0)
            throw new UnsupportedOperationException();
        hits--;
    }

    public boolean isActive(){
        return hits>0;
    }
}
