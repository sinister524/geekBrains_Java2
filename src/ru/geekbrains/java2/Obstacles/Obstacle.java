package ru.geekbrains.java2.Obstacles;

public abstract class Obstacle {

    private int value;

    public Obstacle(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

