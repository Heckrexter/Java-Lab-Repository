// Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have properties such as make, model, year, and fuel type. Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.

class Vehicle {
    String make;
    String model;
    int year;
    String fuelType;
    Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }
    double getFuelEfficiency() {
        return 0.0;
    }
    double getDistanceTraveled() {
        return 0.0;
    }
    double getMaxSpeed() {
        return 0.0;
    }
    public String toString() {
        return "Make: " + make + "\nModel: " + model + "\nYear: " + year + "\nFuel Type: " + fuelType;
    }
}

class Truck extends Vehicle {
    int maxLoad;
    Truck(String make, String model, int year, String fuelType, int maxLoad) {
        super(make, model, year, fuelType);
        this.maxLoad = maxLoad;
    }
    double getFuelEfficiency() {
        return 0.0;
    }
    double getDistanceTraveled() {
        return 0.0;
    }
    double getMaxSpeed() {
        return 0.0;
    }
    public String toString() {
        return super.toString() + "\nMax Load: " + maxLoad;
    }
}

class Car extends Vehicle {
    int numDoors;
    Car(String make, String model, int year, String fuelType, int numDoors) {
        super(make, model, year, fuelType);
        this.numDoors = numDoors;
    }
    double getFuelEfficiency() {
        return 0.0;
    }
    double getDistanceTraveled() {
        return 0.0;
    }
    double getMaxSpeed() {
        return 0.0;
    }
    public String toString() {
        return super.toString() + "\nNumber of Doors: " + numDoors;
    }
}

class Motorcycle extends Vehicle {
    int numWheels;
    Motorcycle(String make, String model, int year, String fuelType, int numWheels) {
        super(make, model, year, fuelType);
        this.numWheels = numWheels;
    }
    double getFuelEfficiency() {
        return 0.0;
    }
    double getDistanceTraveled() {
        return 0.0;
    }
    double getMaxSpeed() {
        return 0.0;
    }
    public String toString() {
        return super.toString() + "\nNumber of Wheels: " + numWheels;
    }
}

public class Three {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Honda", "Civic", 2010, "Gas");
        System.out.println(v);
        System.out.println(v.getFuelEfficiency());
        System.out.println(v.getDistanceTraveled());
        System.out.println(v.getMaxSpeed());
        System.out.println();

        Truck t = new Truck("Ford", "F-150", 2015, "Diesel", 1000);
        System.out.println(t);
        System.out.println(t.getFuelEfficiency());
        System.out.println(t.getDistanceTraveled());
        System.out.println(t.getMaxSpeed());
        System.out.println();

        Car c = new Car("Toyota", "Camry", 2018, "Gas", 4);
        System.out.println(c);
        System.out.println(c.getFuelEfficiency());
        System.out.println(c.getDistanceTraveled());
        System.out.println(c.getMaxSpeed());
        System.out.println();

        Motorcycle m = new Motorcycle("Harley Davidson", "Sportster", 2019, "Gas", 2);
        System.out.println(m);
        System.out.println(m.getFuelEfficiency());
        System.out.println(m.getDistanceTraveled());
        System.out.println(m.getMaxSpeed());
        System.out.println();
    }
}