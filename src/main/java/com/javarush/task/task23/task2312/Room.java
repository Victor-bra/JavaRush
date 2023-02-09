package com.javarush.task.task23.task2312;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Room {
    private int width, height;
    private Snake snake;
    private Mouse mouse;

    public static Room game;

    public Room(int width, int height, Snake snake) {
        this.width = width;
        this.height = height;
        this.snake = snake;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Snake getSnake() {
        return snake;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void run() {
        //Создаем объект "наблюдатель за клавиатурой" и стартуем его.
        KeyboardObserver keyboardObserver = new KeyboardObserver();
        keyboardObserver.start();

        //пока змея жива
        while (snake.isAlive()) {
            //"наблюдатель" содержит события о нажатии клавиш?
            if (keyboardObserver.hasKeyEvents()) {
                KeyEvent event = keyboardObserver.getEventFromTop();
                //Если равно символу 'q' - выйти из игры.
                if (event.getKeyChar() == 'q') return;

                //Если "стрелка влево" - сдвинуть фигурку влево
                if (event.getKeyCode() == KeyEvent.VK_LEFT)
                    snake.setDirection(SnakeDirection.LEFT);
                    //Если "стрелка вправо" - сдвинуть фигурку вправо
                else if (event.getKeyCode() == KeyEvent.VK_RIGHT)
                    snake.setDirection(SnakeDirection.RIGHT);
                    //Если "стрелка вверх" - сдвинуть фигурку вверх
                else if (event.getKeyCode() == KeyEvent.VK_UP)
                    snake.setDirection(SnakeDirection.UP);
                    //Если "стрелка вниз" - сдвинуть фигурку вниз
                else if (event.getKeyCode() == KeyEvent.VK_DOWN)
                    snake.setDirection(SnakeDirection.DOWN);
            }

            snake.move();   //двигаем змею
            print();        //отображаем текущее состояние игры
            sleep();        //пауза между ходами
        }

        //Выводим сообщение "Game Over"
        System.out.println("Game Over!");
    }

    public void print() {
        String[][] place = new String[height][width];
        for (int i = 0; i < place.length; i++) {
            for (int j = 0; j < place[0].length; j++) {
                place[i][j] = ".";
            }
        }

        ArrayList<SnakeSection> snakeSectionList = new ArrayList<>(snake.getSections());
        for (SnakeSection snakeSection : snakeSectionList)
            place[snakeSection.getY()][snakeSection.getX()] = "x";

        place[snake.getY()][snake.getX()] = snake.isAlive() ? "X" : "*";

        place[mouse.getY()][mouse.getX()] = "^";

        for(int i = 0;i< place.length;i++){
            for(int j=0;j< place[0].length;j++){
                System.out.print(place[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void createMouse() {
        mouse = new Mouse((int) (Math.random() * width), (int) (Math.random() * height));
    }

    public void eatMouse() {
        createMouse();
    }

    public void sleep() {
        try {
            Thread.sleep(snake.getSections().size() < 15 ? 520 - 20 * snake.getSections().size() : 200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        game = new Room(20, 20, new Snake(10, 10));
        game.snake.setDirection(SnakeDirection.DOWN);
        game.createMouse();
        game.run();
    }
}