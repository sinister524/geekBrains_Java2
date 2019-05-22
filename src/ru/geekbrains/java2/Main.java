package ru.geekbrains.java2;

public class Main {

    public static void main(String[] args) {

        Course c = new Course(new Let("Дорожка", 10), new Let("Бревно", 10), new Let("Стена", 30), new Let("Канат", 40),new Let("Труба", 20));

        Team team = new Team("Red team", new Runner("Алексей", 100), new Runner("Владимир", 115), new Runner("Валерий", 120), new Runner("Иван", 80));

        team.showInfo();
        c.dolt(team);
        team.showResults();
    }
}
