package Iheritance;

public class Maruti extends Car{  // multilevel inheritance, it can have its own methods or properties

    public static void main(String[] args) {
        Maruti maruti = new Maruti();
        maruti.speeding();
        maruti.accelerate();
    }
}
