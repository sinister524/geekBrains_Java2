package ru.geekbrains.java2;

public class Team {

    private String teamName;
    private Runner[] teammates = new Runner[4];

    public Team(String teamName, Runner teammate1, Runner teammate2, Runner teammate3, Runner teammate4) {
        this.teamName = teamName;
        this.teammates[0] = teammate1;
        this.teammates[1] = teammate2;
        this.teammates[2] = teammate3;
        this.teammates[3] = teammate4;
    }

    public void showInfo(){
        System.out.println("Команда: " + this.teamName);

        for (int i = 0; i < teammates.length; i++) {
            System.out.println("Участник №" + (i+1) + " - " + teammates[i].getName());
        }
        System.out.println();
    }

    public void showResults() {
        for (int i = 0; i < teammates.length; i++) {
            if (teammates[i].isSuccess()){
                System.out.println("Участник №" + (i+1) + " - " + teammates[i].getName() + " прошел посолу препядствий");
            } else {
                System.out.println("Участник №" + (i+1) + " - " + teammates[i].getName() + " не прошел полосу препядствий");
            }
        }
        System.out.println();
    }

    public String getTeamName() {
        return teamName;
    }

    public Runner[] getTeammates() {
        return teammates;
    }
}
