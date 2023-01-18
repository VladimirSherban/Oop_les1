package Drivers;

import transport.Competing;
import transport.Transport;

public class DriverD<D extends Transport & Competing> extends Driver {
    public DriverD(String name, boolean driverLicense, String experience) {
        super(name, driverLicense, experience);
    }

    public void showInfo(D bus) {
        System.out.println("Водитель " + getName() + " управляет автомобилем " + bus + " и будет участвовать в заезде");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
