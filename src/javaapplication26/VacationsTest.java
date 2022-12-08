package com.company;

import java.util.Random;
import java.util.Scanner;

public class VacationsTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arrVacation = new int[n];

        Random rand = new Random();
        int temp = rand.nextInt(2000) + 200;

        Vacation myObj = new Vacation();
        myObj.setBudget(temp);
    }
}
