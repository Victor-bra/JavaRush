package com.javarush.task.task24.task2413;

public class Ball extends BaseObject {
    private double speed;
    private double direction;
    private double dx, dy;
    private boolean isFrozen;

    public Ball(double x, double y, double speed, double direction) {
        super(x, y, 1);

        this.speed = speed;
        this.direction = direction;

        this.isFrozen = true;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        if (direction >= 0 || direction <= 360)
            this.direction = direction;
        else
            throw new NumberFormatException();

        double angel = Math.toRadians(direction);
        this.dx = Math.cos(angel) * this.speed;
        this.dy = -Math.cos(angel) * this.speed;
    }

    public double getDx() {
        return dx;
    }

    public void setDx(double dx) {
        this.dx = dx;
    }

    public double getDy() {
        return dy;
    }

    public void setDy(double dy) {
        this.dy = dy;
    }

    void checkRebound(int minx, int maxx, int miny, int maxy) {
        if (x < minx) {
            x = minx + (minx - x);
            dx = -dx;
        }

        if (x > maxx) {
            x = maxx - (x - maxx);
            dx = -dx;
        }

        if (y < miny) {
            y = miny + (miny - y);
            dy = -dy;
        }

        if (y > maxy) {
            y = maxy - (y - maxy);
            dy = -dy;
        }
    }

    /**
     * Запускам шарик.
     * isFrozen = false.
     * Пересчитываем вектор движения (dx,dy).
     */
    void start() {
        this.setDirection(direction);
        this.isFrozen = false;
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.setPoint(super.x, super.y, 'O');
    }

    @Override
    public void move() {
        if (!isFrozen) {
            super.x += this.dx;
            super.y += this.dy;
            checkRebound(1, Arkanoid.game.getWidth(), 1, Arkanoid.game.getHeight() + 5);
        }
    }
}
