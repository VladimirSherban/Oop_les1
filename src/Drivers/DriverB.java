package Drivers;

import transport.PassengerCar;

public class DriverB extends Driver<PassengerCar> {
    public DriverB(String name, boolean driverLicense, String experience, LicenseType licenseType) {
        super(name, driverLicense, experience, licenseType);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
