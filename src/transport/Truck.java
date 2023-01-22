package transport;

import Drivers.Driver;
import Drivers.LicenseType;

public class Truck extends Transport implements Competing {

    private final LoadCapacity loadCapacity;
    private CarBodyType bodyType;

    public Truck(String brand, String model, Double engineVolume, LoadCapacity loadCapacity, CarBodyType bodyType) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
        this.bodyType = bodyType;
    }

    public void setBodyType(CarBodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void pitStop() {
        System.out.println("пит-стоп грузовика  " + getBrand() + " " + getModel());
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга грузовика " + getModel() + " " + getBrand() + " = " + ((int) ((Math.random() * 30 + 20)) + " мин."));
    }

    @Override
    public void getDiagnosed(Driver<?> driver) {
        if (driver.getLicenseType() == null || driver.getLicenseType() != LicenseType.C) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Необходимо указать тип прав");
            }
        } else {
            System.out.println("Диагностика прошла успешно");
        }
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость грузовика  " + getModel() + " " + getBrand() + " = " + ((int) (Math.random() * 10 + 70)) + " км/ч");
    }

    public void startMoving() {
        System.out.println("Грузовик - " + getModel() + " " + getBrand() + " начал движение");
    }

    public void endMoving() {
        System.out.println("Грузовик - " + getModel() + " " + getBrand() + " закончил движение");
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString() +
                "loadCapacity=" + loadCapacity +
                '}';
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(bodyType.getCarType());
        }
    }

    public CarBodyType getBodyType() {
        return bodyType;
    }
}
