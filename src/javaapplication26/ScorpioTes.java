package com.company.test_23;

public class ScorpioTes {
    public static void main(String[] args) {
        Scorpio scorpio = new Scorpio(6, 12, 16, 20);
        Scorpio blackScorpio = new Scorpio();
        Scorpio dangerousScorpio = new Scorpio(6, 500, 19, 15);
        Scorpio lightScorpio = new Scorpio(6, 23, 20, 1);
        scorpio.addScorpioToScorpios(blackScorpio);
        scorpio.addScorpioToScorpios(dangerousScorpio);
        scorpio.addScorpioToScorpios(lightScorpio);

        System.out.println("Current scorpio: " + scorpio.toString());
        System.out.println("Scorpios arr: " + scorpio.scorpionsToString());
        scorpio.getSelectedScorpios(19);
    }
}
