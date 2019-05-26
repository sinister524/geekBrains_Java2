package ru.geekbrains.java2;

import java.util.Random;

public class TestMethods {

    public static void summArr (String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4 || arr[0].length != 4) throw new MyArraySizeException("Массив не соответсвует требованию");

        int i = 0;
        int j = 0;
        int summ = 0;

        try {
            while (i < arr.length) {
                while (j < arr [i].length) {

                    summ = summ + Integer.parseInt(arr[i][j]);

                    j++;
                }
                j = 0;
                i++;

            }
        } catch (NumberFormatException e) {
            throw new MyArrayDataException("Ячейка " + i + "," + j + " не является числом");
        }

        System.out.println("Сумма ячеек равна: " + summ);

    }

    public static void fillArr (String [][] arr) {

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                Integer e = random.nextInt(100);
                arr[i][j] = e.toString();
            }
        }
        arr[arr.length-1][0] = "word";
    }
}
