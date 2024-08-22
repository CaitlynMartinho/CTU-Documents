/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance;

/**
 *
 * @author caitl
 */

//Creates main vehicle class
class Vehicle {
    
    //Defines the make and model strings
    private String make;
    private String model;

    //Creates method to get and store make and model in variables
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    //Method to display the make and model
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
    }
}

//class for displaying car info
class Car extends Vehicle {
    //declares num of doors variables
    private int numberOfDoors;

    //Gets make and model from vehicle and adds number of doors
    public Car(String make, String model, int numberOfDoors) {
        //super reffers to parent class
        super(make, model);
        this.numberOfDoors = numberOfDoors;
    }

    //overrides current displayinfo method 
    @Override
    public void displayInfo() {
        
        //super reffers to parent class
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

public class Inheritance {

    public static void main(String[] args) {
        //Inputs info in the car method
        Car car = new Car("Toyota", "Corolla", 4);

        //Calls the car method
        car.displayInfo();
        
    }
    
}
