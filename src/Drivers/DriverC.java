package Drivers;

import transport.Competing;
import transport.Transport;

public class DriverC<C extends Transport & Competing> extends Driver {
    public DriverC(String name, boolean driverLicense, String experience) {
        super(name, driverLicense, experience);
    }

    public void showInfo(C truck) {
        System.out.println("Водитель " + getName() + " управляет автомобилем " + truck + " и будет участвовать в заезде");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
