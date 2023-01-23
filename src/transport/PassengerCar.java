package transport;

import Drivers.Driver;
import Drivers.LicenseType;
import transport.exception.CheckLicenseException;

public class PassengerCar extends Transport implements Competing {

    private CarBodyType bodyType;

    public PassengerCar(String brand, String model, Double engineVolume, CarBodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    public CarBodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(CarBodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void pitStop() {
        System.out.println("пит-стоп легковой машины  " + getBrand() + " " + getModel());
    }

    @Override
    public void getDiagnosed(Driver<?> driver) throws CheckLicenseException {

        if (driver.getLicenseType() == null || driver.getLicenseType() != LicenseType.B) {
            String message = driver.getLicenseType() == null ? "Необходимо указать тип прав!" : "Неподходящая категория прав у водителя!";
            throw new CheckLicenseException(message);
        }
        System.out.println("Диагностика прошла успешно");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга легковой машины "
                + getModel() + " " + getBrand() + " = " + ((int) ((Math.random() * 5 + 5)) + " мин."));
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость машины  " + getModel() + " " + getBrand() + " = " + ((int) (Math.random() * 100 + 100)) + " км/ч");
    }

    public void startMoving() {
        System.out.println("Машина - " + getModel() + " " + getBrand() + " начала движение");
    }

    public void endMoving() {
        System.out.println("Машина - " + getModel() + " " + getBrand() + " закончила движение");
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
    public String toString() {
        return "Transport{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", body type='" + bodyType + '\'' +
                '}';
    }
}
