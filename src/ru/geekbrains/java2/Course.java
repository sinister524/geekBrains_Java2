package ru.geekbrains.java2;

public class Course {

    private Let [] lets = new Let[5];

    public Course(Let let1, Let let2, Let let3, Let let4, Let let5) {
        this.lets[0] = let1;
        this.lets[1] = let2;
        this.lets[2] = let3;
        this.lets[3] = let4;
        this.lets[4] = let5;

    }

    public void dolt (Team team) {
        System.out.println("Команда " + team.getTeamName() + " проходит полосу препядствий.");
        for (int i = 0; i < team.getTeammates().length; i++) {
            System.out.println("Участник - " + team.getTeammates()[i].getName());
            for (int j = 0; j < this.lets.length; j++) {
                if (team.getTeammates()[i].getEndurance() - this.lets[j].getEnergyNeed() > 0){
                    System.out.println("    преодолел препядствие " + this.lets[j].getName());
                    team.getTeammates()[i].setEndurance(team.getTeammates()[i].getEndurance() - this.lets[j].getEnergyNeed());
                } else {
                    System.out.println("    не преодолел препядствие " + this.lets[j].getName() + "\n Участник выбывает \n");
                    team.getTeammates()[i].setSuccess(false);
                    team.getTeammates()[i].setEndurance(0);
                    break;
                }
                if (j+1 == this.lets.length) {
                    System.out.println("Участник успшно прошел полосу препядствий! \n");
                    team.getTeammates()[i].setSuccess(true);
                }
            }
        }
        System.out.println();
    }

}
