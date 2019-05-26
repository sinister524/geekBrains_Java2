package ru.geekbrains.java2;

public class Main {

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {


        String [][] strings1 = new String[5][4];
        String [][] strings2 = new String[4][5];
        String [][] strings3 = new String[4][4];
        String [][] strings4 = new String[4][4];

        TestMethods.fillArr(strings1);
        TestMethods.fillArr(strings2);
        TestMethods.fillArr(strings3);
        TestMethods.fillArr(strings4);

        strings4[3][0] = "70";

        try {
            TestMethods.summArr(strings1);
        } catch (MyArraySizeException e){
            System.out.println(e.getMessage());
        }
        try {
            TestMethods.summArr(strings2);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }
        try {
            TestMethods.summArr(strings3);
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
        TestMethods.summArr(strings4);
    }
}
