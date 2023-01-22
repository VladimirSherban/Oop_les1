package transport;

public class PassengerCar extends Transport implements Competing {

    private final PassengerCarBodyType bodyType;
    private TransportType type;

    public PassengerCar(String brand, String model, Double engineVolume, PassengerCarBodyType bodyType, TransportType type) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
        this.type = type;
    }

    public PassengerCarBodyType getBodyType() {
        return bodyType;
    }

    public void setType(TransportType type) {
        this.type = type;
    }

    @Override
    public void pitStop() {
        System.out.println("пит-стоп легковой машины  " + getBrand() + " " + getModel());
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
        if (type == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(type.getName());
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
