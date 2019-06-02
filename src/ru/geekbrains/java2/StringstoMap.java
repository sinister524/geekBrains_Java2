package ru.geekbrains.java2;

import java.util.HashMap;
import java.util.Map;


public class StringstoMap {

    public static HashMap stringtomap(String[] strings) {

        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {

            if (map.containsKey(strings[i])) map.put(strings[i], map.get(strings[i]) + 1);
            else map.put(strings[i], 1);
        }

        return  map;
    }

}
