package Abstraction;

public class Scooter extends Vehicle {

    @Override
    void start() {
        System.out.println("Scooter start with Kick!");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start();

        Scooter scooter = new Scooter();
        scooter.start();
    }
}
