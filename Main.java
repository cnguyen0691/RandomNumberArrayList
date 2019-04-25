package com.company;
import java.util.Random;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numList = new ArrayList<Integer>();
        Random ranNum = new Random();
        int ranNumber;

        //Initialize elements of an array
        for (int i = 0; i < 8; i++) {
            ranNumber = ranNum.nextInt(100);//creates a random number between 1 and 100
            numList.add(ranNumber);
        }
        System.out.println(numList);
        System.out.println(numList.get(ranNum.nextInt(numList.size())));
    }
}
