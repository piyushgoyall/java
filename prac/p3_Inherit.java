// Create two classes "Car" and "Bike" from interface "Vehicle" as below:

interface Vehicle {
    void changeGear(int a); // To set the gear to a.

    void speedUp(int a); // To add a in speed.

    void applyBrakes(int a); // To decrease a from speed.
}

// The classes must have gear and speed class variables and also a toString
// method to return a string as "150kmph" if 150 is the current speed.

class Car implements Vehicle {
    private int gear = 0;
    private int speed = 0;

    @Override
    public void changeGear(int a) {
        this.gear = a;
    }

    @Override
    public void speedUp(int a) {
        this.speed += a;
    }

    @Override
    public void applyBrakes(int a) {
        this.speed -= a;
    }

    public String toString() {
        return (speed + "kmph");
    }

    public int getGear() {
        return gear;
    }
}

class Bike implements Vehicle {
    private int gear = 0;
    private int speed = 0;

    @Override
    public void changeGear(int a) {
        this.gear = a;
    }

    @Override
    public void speedUp(int a) {
        this.speed += a;
    }

    @Override
    public void applyBrakes(int a) {
        this.speed -= a;
    }

    public String toString() {
        return (speed + "kmph");
    }

    public int getGear() {
        return gear;
    }
}

public class p3_Inherit {
    public static void main(String[] args) {
        // Create a Car object
        Car car = new Car();
        car.changeGear(2); // Change to gear 2
        car.speedUp(50); // Speed up by 50 kmph
        car.applyBrakes(10); // Apply brakes, reduce speed by 10 kmph
        System.out.println("Car's current speed: " + car);

        // Create a Bike object
        Bike bike = new Bike();
        bike.changeGear(1); // Change to gear 1
        bike.speedUp(30); // Speed up by 30 kmph
        bike.applyBrakes(5); // Apply brakes, reduce speed by 5 kmph
        System.out.println("Bike's current speed: " + bike);
    }
}
