package com.javarush.task.task24.task2413;

public abstract class BaseObject {
    protected double x, y, radius;

    public BaseObject(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    abstract void draw(Canvas canvas);

    abstract void move();

    public boolean intersects(BaseObject o) {
        double distance = Math.hypot(this.x - o.x, this.y - o.y);
        if (distance <= Math.max(this.radius, o.radius))
            return true;
        return false;
    }

    /**
     * Проверяем - не выходит ли (x,y) за границы.
     */
    void checkBorders(double minx, double maxx, double miny, double maxy) {
        if (x < minx) x = minx;
        if (x > maxx) x = maxx;
        if (y < miny) y = miny;
        if (y > maxy) y = maxy;
    }
}
