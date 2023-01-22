package transport;

public class Truck extends Transport implements Competing {

    private final LoadCapacity loadCapacity;
    private TransportType type;

    public Truck(String brand, String model, Double engineVolume, LoadCapacity loadCapacity, TransportType type) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
        this.type = type;
    }

    public void setType(TransportType type) {
        this.type = type;
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
        if (type == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(type.getName());
        }
    }

    public TransportType getType() {
        return type;
    }
}
