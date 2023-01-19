package Drivers;

import transport.PassengerCar;

public class DriverB extends Driver<PassengerCar> {
    public DriverB(String name, boolean driverLicense, String experience) {
        super(name, driverLicense, experience);
    }



    @Override
    public String toString() {
        return super.toString();
    }
}
