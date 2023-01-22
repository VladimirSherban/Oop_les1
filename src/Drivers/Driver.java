package Drivers;

import transport.Transport;

public abstract class Driver<T extends Transport> {

    private final String name;
    private boolean driverLicense;
    private String experience;
    private LicenseType licenseType;

    public LicenseType getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(LicenseType licenseType) {
        this.licenseType = licenseType;
    }

    public Driver(String name, boolean driverLicense, String experience, LicenseType licenseType) {

        this.licenseType = licenseType;

        if (name == null || name.trim().isEmpty()) {
            this.name = "Не указано имя водителя";
        } else {
            this.name = name;
        }

        this.driverLicense = driverLicense;
        setExperience(experience);
    }

    public void showInfo(T transport) {
        System.out.println("Водитель " + getName() + " управляет автомобилем " + transport + " и будет участвовать в заезде");
    }

    public void startMoving() {
        System.out.println(getName() + " начал движение");
    }

    public void stopMoving() {
        System.out.println(getName() + " закончил движение");
    }

    public void refuelCar(Integer fuel) {
        System.out.println(getName() + " заправил авто на " + fuel + "л. бензина");
    }

    public String getName() {
        return name;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        if (experience == null || experience.trim().isEmpty()) {
            this.experience = "Введите стаж";
        } else {
            this.experience = experience;
        }
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", driverLicense=" + driverLicense +
                ", experience='" + experience + '\'' +
                ", категория прав= " + licenseType + '\'' +
                '}';
    }
}
