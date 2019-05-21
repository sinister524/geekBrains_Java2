package ru.geekbrains.java2;

import ru.geekbrains.java2.Competitors.Cat;
import ru.geekbrains.java2.Competitors.Competitor;
import ru.geekbrains.java2.Competitors.Human;
import ru.geekbrains.java2.Competitors.Robot;
import ru.geekbrains.java2.Obstacles.Obstacle;
import ru.geekbrains.java2.Obstacles.Track;
import ru.geekbrains.java2.Obstacles.Wall;

public class Main {

    public static void main(String[] args) {


        Competitor [] competitors = new Competitor[3];
        competitors[0] = new Human("Vasiliy",100,2);
        competitors[1] = new Cat("Cissy", 70, 4);
        competitors[2] = new Robot("Atlas", 500, 3);

        Obstacle [] path = new Obstacle[7];
        path[0] = new Track(5);
        path[1] = new Wall(1);
        path[2] = new Track(20);
        path[3] = new Wall(3);
        path[4] = new Track(25);
        path[5] = new Wall(4);
        path[6] = new Track(20);



        for (int i = 0; i < competitors.length; i++) {
            System.out.println("Участник № " + (i + 1) + " - " + competitors[i].getName());
            for (int j = 0; j < path.length; j++) {
                if (path[j].getClass().equals(Track.class)){
                    if (competitors[i].run(path[j].getValue())) {
                        System.out.println(competitors[i].getName() + " пробежал беговую дорожку длинной " + path[j].getValue() + "\n Оставшаяся выносливость " + competitors[i].getEndurance());
                    } else {
                        System.out.println(competitors[i].getName() + " не смог пробежать беговую дорожку " + path[j].getValue() + "\n Участник выбывает.");
                        break;
                    }
                }
                if (path[j].getClass().equals(Wall.class)) {
                    if (competitors[i].jump(path[j].getValue())) {
                        System.out.println(competitors[i].getName() + " перепрыгнул стену высотой " + path[j].getValue());
                    } else {
                        System.out.println(competitors[i].getName() + " не смог перепрыгнуть стену высотой " + path[j].getValue() +  "\n Участник выбывает. \n");
                        break;
                    }
                }
                if (j+1 == path.length) System.out.println("Участник " + competitors[i].getName() + " преодолел все препядствия! \n");
            }
        }

    }
}

