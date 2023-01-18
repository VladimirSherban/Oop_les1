package Drivers;

import transport.Competing;
import transport.Transport;

public class DriverB<B extends Transport & Competing> extends Driver {
    public DriverB(String name, boolean driverLicense, String experience) {
        super(name, driverLicense, experience);
    }

    public void showInfo(B passengerCar){
        System.out.println("Водитель " + getName() + " управляет автомобилем " + passengerCar + " и будет участвовать в заезде");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
