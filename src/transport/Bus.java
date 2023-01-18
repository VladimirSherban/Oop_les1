package transport;

public class Bus extends Transport implements Competing {


    public Bus(String brand, String model, Double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand=" + getBrand() + '\'' +
                ", model=" + getModel() + '\'' +
                '}';
    }

    @Override
    public void pitStop() {
        System.out.println("пит-стоп автомобиля  " + getBrand() + " " + getModel());
    }

    @Override
    public void bestLapTime(Integer time) {
        System.out.println("Лучшее время круга машины " + getModel() + " " + getBrand() + " = " + time);
    }

    @Override
    public void maxSpeed(Integer speed) {
        System.out.println("Максимальная скорость машины  " + getModel() + " " + getBrand() + " = " + speed);
    }
}
