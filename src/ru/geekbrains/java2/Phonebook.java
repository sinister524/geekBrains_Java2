package ru.geekbrains.java2;

import java.util.HashMap;

public class Phonebook {

    private HashMap <String, String> map = new HashMap<>();

    public void add(String name, String phoneNumber) {
        if (this.map.containsKey(name)) this.map.put(name, this.map.get(name) + "; " + phoneNumber);
        else map.put(name, phoneNumber);
    }

    public String get (String name) {
        return name + " : " + this.map.getOrDefault(name, "Number not found");
    }

}
