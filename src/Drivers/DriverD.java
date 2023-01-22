package Drivers;

import transport.Bus;

public class DriverD extends Driver<Bus> {
    public DriverD(String name, boolean driverLicense, String experience, LicenseType licenseType) {
        super(name, driverLicense, experience, licenseType);
    }

    public void showInfo(Bus bus) {
        System.out.println("Водитель " + getName() + " управляет автомобилем " + bus + " и будет участвовать в заезде");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
