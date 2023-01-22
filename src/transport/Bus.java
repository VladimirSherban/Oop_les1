package transport;

public class Bus extends Transport implements Competing {

    private final CapacityBus capacityBus;
    private TransportType type;

    public Bus(String brand, String model, Double engineVolume, CapacityBus capacityBus, TransportType type) {
        super(brand, model, engineVolume);
        this.capacityBus = capacityBus;
        this.type = type;
    }

    public void setType(TransportType type) {
        this.type = type;
    }

    public void startMoving() {
        System.out.println("Автобус - " + getModel() + " " + getBrand() + " начал движение");
    }

    public void endMoving() {
        System.out.println("Автобус - " + getModel() + " " + getBrand() + " закончил движение");
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

    public TransportType getType() {
        return type;
    }
}
