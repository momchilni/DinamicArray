package com.company.test_23;

import java.util.ArrayList;
import java.util.Arrays;

public class Scorpio {
    private int legs;
    private int poison;
    private int length;
    private int weight;
//    private Scorpio[] arrScorpio;
    private ArrayList<Scorpio> arrScorpio;

    public Scorpio(int legs, int poison, int length, int weight) {
        this.legs = legs;
        this.poison = poison;
        this.length = length;
        this.weight = weight;
//        arrScorpio = new Scorpio[];
        arrScorpio = new ArrayList<>();
    }

    public Scorpio() {
       this.legs = 6;
       this.length = 15;
       this.poison = 50;
       this.weight = 30;
//        this(6, 15, 2, 13);
    }

    public Scorpio(Scorpio scorpio) {
        this.setLegs(scorpio.getLegs());
        this.setPoison(scorpio.getPoison());
        this.setLength(scorpio.getLength());
        this.setWeight(scorpio.getWeight());
        this.setArrScorpio(scorpio.getArrScorpio());
    }

    public int getLegs() {
        return legs;
    }

    public int getLength() {
        return length;
    }

    public int getPoison() {
        return poison;
    }

    public int getWeight() {
        return weight;
    }

    public ArrayList<Scorpio> getArrScorpio() {
        return arrScorpio;
    }

    public void setLegs(int legs) {
        if (legs != 6) {
            this.legs = 6;
        } else {
            this.legs = legs;
        }
    }

    public void setLength(int length) {
        if (length < 1) {
            this.length = 5;
        } else {
            this.length = length;
        }
    }

    public void setPoison(int poison) {
        if (poison < 1) {
            this.poison = 30;
        } else {
            this.poison = poison;
        }
    }

    public void setWeight(int weight) {
        if (this.weight < 1) {
            this.weight = 3;
        } else {
            this.weight = weight;
        }
    }

    public void setArrScorpio(ArrayList<Scorpio> arrScorpio) {
        this.arrScorpio = arrScorpio;
    }

    public void addScorpioToScorpios(Scorpio scorpio) {
        arrScorpio.add(scorpio);
    }

    public String scorpionsToString() {
        return Arrays.toString(arrScorpio.toArray());
    }

    public String toString() {
        String res = String.format("Legs: %d, poison: %d mg, length: %d cm, weight: %d \n", legs, poison, length, weight);
        return res;
    }

    public void getSelectedScorpios(int length) {
        ArrayList<Scorpio> newScorpios = new ArrayList<>();
        arrScorpio.forEach(scorpio -> {
            if (scorpio.length >= length) {
                newScorpios.add(scorpio);
            }
        });
        System.out.println("Number of scorpios with this length " + newScorpios.toArray().length);
    }
}
