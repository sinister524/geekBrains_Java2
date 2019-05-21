package ru.geekbrains.java2.Competitors;

import ru.geekbrains.java2.Move;

public abstract class Competitor implements Move {

    private String name;
    private int endurance;
    private int jumpHeight;

    public Competitor(String name, int endurance, int jumpHeight) {
        this.name = name;
        this.endurance = endurance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public boolean run(int obstacle) {
        if (this.endurance - obstacle < 0) {
            this.endurance = 0;
            return false;
        } else {
            this.endurance = this.endurance - obstacle;
            return true;
        }
    }

    @Override
    public boolean jump(int obstacle) {
        return this.jumpHeight >= obstacle;
    }

    public String getName() {
        return name;
    }

    public int getEndurance() {
        return endurance;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }
}

