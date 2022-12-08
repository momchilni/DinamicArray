/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */




/**
 *
 * @author momchil.ivanov
 */
public class NewClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
        Car arrCars[] = new Car[12];
        arrCars[0] = new Car();
        Car J = new Car();
        Car K = new Car(J);
        K.setBrand("Hui");
        K.changeWeight(15);
        System.out.print(arrCars[0].toString());
        for (Car car : arrCars) {
            car = new Car();
            car.toString();
        }
    }
    //ne mi stigna vremeto

}
