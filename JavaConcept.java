import java.util.*;


class Vehicle {
    protected String brand;
    protected int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void startEngine() {
        System.out.println("Engine started for " + brand);
    }

    public void stopEngine() {
        System.out.println("Engine stopped for " + brand);
    }
}


class Car extends Vehicle {
    private int speed;

    public Car(String brand, int year, int speed) {
        super(brand, year);
        this.speed = speed;
    }

    public void accelerate(int increment) {
        speed += increment;
        System.out.println(brand + " is accelerating. Current speed: " + speed + " km/h");
    }


    public void startEngine() {
        System.out.println("Car engine started for " + brand);
    }
}


interface Radio {
    void playMusic();
    void stopMusic();
}


class CarRadio implements Radio {

    public void playMusic() {
        System.out.println("Playing music in the car radio");
    }


    public void stopMusic() {
        System.out.println("Music stopped in the car radio");
    }
}

public class Main {
  public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2022, 0);
        myCar.startEngine();
        myCar.accelerate(50);
        myCar.stopEngine();

     
        CarRadio carRadio = new CarRadio();
        carRadio.playMusic();
        carRadio.stopMusic();
    }
}
