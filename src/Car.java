
import java.util.Scanner; 
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author aleksandarpd
 */

class Car{
    private float weight;
    private String brand;
    private int years;
    
    public Car(float weight, String brand, int years){
        this.weight = weight;
        this.years = years;
        this.brand = brand;
    }
    
    public void setWeight(float newWeight){
        if(newWeight>0)this.weight = newWeight;
    }
    
    public float getWeight(){
        return(this.weight);
    }
    
    public void setBrand(String newBrand){
        if(!newBrand.isEmpty())this.brand = newBrand;
    }
    
    public String getBrand(){
        return(this.brand);
    }
    
    public void setYears(int newYears){
        if(newYears>0)this.years = newYears;
    }
    
    public int getYears(){
        return(this.years);
    }
    
    public Car(){
        this((float)2.5, "Honda", 13);    
    }
    
    public Car(Car car){
        this(car.getWeight(), car.getBrand(), car.getYears());
    }
    
    public void changeWeight(float changedWeight){
        this.setWeight(changedWeight);
    }
    
    public String toString(){
         return String.format("Weight: %f; Brand: %s; Years: %d", getWeight(), getBrand(), getYears());
    
    }
    
}


