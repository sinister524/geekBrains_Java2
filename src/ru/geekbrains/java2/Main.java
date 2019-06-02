package ru.geekbrains.java2;

public class Main {

    public static void main(String[] args) {
	// Задание 1

        String [] fruits = new String[10];
        fruits[0] = "Banana";
        fruits[1] = "Apple";
        fruits[2] = "Orange";
        fruits[3] = "Banana";
        fruits[4] = "Lemon";
        fruits[5] = "Apple";
        fruits[6] = "Pear";
        fruits[7] = "Mandarin";
        fruits[8] = "Orange";
        fruits[9] = "Banana";

        System.out.println("Встречающиеся слова в массиве \n " + StringstoMap.stringtomap(fruits));


     // Задание 2

        Phonebook phonebook = new Phonebook();

        phonebook.add("Ivanov", "+79538473321");
        phonebook.add("Kocherishka", "+79187529955");
        phonebook.add("Pihtelka", "+79115371578");
        phonebook.add("Ivanov", "+79538473321");
        phonebook.add("Prokladkin", "+79036915260");
        phonebook.add("Zaruba", "+79677561299");

        System.out.println(phonebook.get("Zaruba"));
        System.out.println(phonebook.get("Ivanov"));
        System.out.println(phonebook.get("Prokladkin"));
        System.out.println(phonebook.get("Pihtelka"));
        System.out.println(phonebook.get("Petrov"));

    }
}
