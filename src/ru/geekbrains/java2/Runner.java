package ru.geekbrains.java2;

public class Runner {

    private String name;
    private int endurance;
    private boolean success;

    public Runner(String name, int endurance) {
        this.name = name;
        this.endurance = endurance;
        this.success = false;
    }

    public String getName() {
        return name;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }


}
