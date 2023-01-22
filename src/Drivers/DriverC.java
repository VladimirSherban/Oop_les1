package Drivers;

import transport.Truck;

public class DriverC extends Driver<Truck> {
    public DriverC(String name, boolean driverLicense, String experience, LicenseType licenseType) {
        super(name, driverLicense, experience, licenseType);
    }

    @Override

    public String toString() {
        return super.toString();
    }
}
