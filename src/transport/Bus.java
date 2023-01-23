package transport;

import Drivers.Driver;
import transport.exception.CheckLicenseException;

public class Bus extends Transport implements Competing {

    private final CapacityBus capacityBus;
    private CarBodyType bodyType;


    public Bus(String brand, String model, Double engineVolume, CapacityBus capacityBus, CarBodyType bodyType,
               Driver<Bus> driver) {
        super(brand, model, engineVolume, driver);
        this.capacityBus = capacityBus;
        this.bodyType = bodyType;
    }

    public void setType(CarBodyType bodyType) {
        this.bodyType = bodyType;
    }

    public void startMoving() {
        System.out.println("Автобус - " + getModel() + " " + getBrand() + " начал движение");
    }

    public void endMoving() {
        System.out.println("Автобус - " + getModel() + " " + getBrand() + " закончил движение");
    }

    @Override
    public void getDiagnosed(Driver<?> driver) throws CheckLicenseException {
        throw new CheckLicenseException("Автобус не может пройти диагностику");
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(bodyType.getCarType());
        }
    }

    @Override
    public void pitStop() {
        System.out.println("пит-стоп автобуса  " + getBrand() + " " + getModel());
    }

    @Override
    public void bestLapTime() {

        System.out.println("Лучшее время круга автобуса " + getModel() + " " + getBrand() + " = " + ((int) ((Math.random() * 20 + 10)) + " мин."));
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость машины  " + getModel() + " " + getBrand() + " = " + ((int) (Math.random() * 100 + 35)) + " км/ч");
    }

    public CapacityBus getCapacityBus() {
        return capacityBus;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand=" + getBrand() + '\'' +
                ", model=" + getModel() + '\'' +
                "capacity=" + capacityBus + '\'' +
                '}';
    }

    public CarBodyType getBodyType() {
        return bodyType;
    }
}
