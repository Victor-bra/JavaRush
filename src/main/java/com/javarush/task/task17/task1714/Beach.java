package com.javarush.task.task17.task1714;

/*
Comparable
*/

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {

    }

    @Override
    public synchronized int compareTo(Beach o) {
        int x1=0;
        int x2=0;
        if(this.distance < o.getDistance())
            x1++;
        else if(this.distance > o.getDistance())
            x2++;
        if(this.quality > o.getQuality())
            x1++;
        else if(this.quality < o.getQuality())
            x2++;
        /*if(this.distance == o.distance && this.quality == o.quality)
            return 0;
        if (dis == 1 && qua == 1)
            return -1;
        if (dis == 0 && qua == 0)
            return 1;
        if (dis == 0 && qua == 1)
            return 1;
        if (dis == 1 && qua == 0)
            return -1;*/
        return x1-x2;
    }
}