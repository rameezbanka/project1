package Iheritance;

public class Car extends Vehicle{           // Single level inheritance


    public void speeding(){
        System.out.println("car is speeding");
    }


    public static void main(String[] args) {
        Car car = new Car();
        car.accelerate();
    }
}
