package com.company;

public class Vacation {

    private int day;
    private int destination;
    private int budget;
    private double costPerDay;

    public void setDay(int day){
        if(day >= 1){
            this.day = day;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    public int getDestination() {
        return destination;
    }

    public void setBudget(int budget) {
        this.budget = budget / this.day;
    }

    public int getBudget() {
        return budget;
    }

    public void setCostPerDay(double costPerDay) {
        this.costPerDay = costPerDay;
    }

    public double getCostPerDay() {
        return costPerDay;
    }

    void vuvejdaneVavVacation(Vacation[] vacations, int n){

        for(int i = 0; i < vacations.length; i++){
            vacations[i] = new Vacation(getDay(), getDestination(), getBudget(), getCostPerDay());
        }

    }

    public String toString(){
        return ("%d%d%d" + getDay() + ", " + getDestination() + ", " + getBudget() + ", " + getCostPerDay());
    }

    void vacationLongestDays(Vacation[] vacations, int n){
        int max_day = -1000;
        for(int i= 0; i < n; i++){
            if(vacations[i].getDay() > max_day){
                max_day = vacations[i].getDay();
            }
        }
    }

    public Vacation(int day, int destination, int budget, double costPerDay){

        setDay(day);
        setDestination(destination);
        setBudget(budget);
        setCostPerDay(costPerDay);

    }

    public Vacation(){

        this(15, 1200, 4000, 4000/15);

    }

    public Vacation(Vacation vacation){
        this(vacation.getDay(), vacation.getDestination(), vacation.getBudget(), vacation.getCostPerDay());
    }




}
