package transport;

import Drivers.Driver;
import Mechanics.Mechanic;
import transport.exception.CheckLicenseException;

import java.util.ArrayList;
import java.util.List;

public abstract class Transport {

    private final String brand;
    private final String model;
    private Double engineVolume;
    private List<Mechanic<?>> mechanicList;
    private Driver<?> driver;

    public Transport(String brand, String model, Double engineVolume, Driver<?> driver) {
        this.driver = driver;

        setEngineVolume(engineVolume);
        this.mechanicList = new ArrayList<>();

        if (model == null || model.trim().isEmpty()) {
            this.model = "Не указана модель";
        } else {
            this.model = model;
        }

        if (brand == null || brand.trim().isEmpty()) {
            this.brand = "Не указан бренд";
        } else {
            this.brand = brand;
        }
    }

    public void startMoving() {
        System.out.println(getModel() + " " + getBrand() + " начал движение");
    }

    public void endMoving() {
        System.out.println(getModel() + " " + getBrand() + " закончил движение");
    }

    public abstract void getDiagnosed(Driver<?> driver) throws CheckLicenseException;

    public void addMechanic(Mechanic<?> mechanic) {
        mechanicList.add(mechanic);
    }

    public void showMechanic() {
        System.out.print("Механики машины " + model + " " + brand + " - ");
        for (Mechanic<?> mechanic : mechanicList) {
            System.out.print(mechanic.getName() + "; ");
        }
        System.out.println();
    }

    public void showDriver() {
        System.out.println("Водитель машины " + model + " " + brand + " - " + driver.getName());
    }

    public List<Mechanic<?>> getMechanicList() {
        return mechanicList;
    }

    public void setMechanicList(List<Mechanic<?>> mechanicList) {
        this.mechanicList = mechanicList;
    }

    abstract void printType();

    public void setEngineVolume(Double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public final String getBrand() {
        return brand;
    }

    public final String getModel() {
        return model;
    }

    public final Double getEngineVolume() {
        return engineVolume;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public Driver<?> getDriver() {
        return driver;
    }

    public void setDriver(Driver<Transport> driver) {
        this.driver = driver;
    }
}
