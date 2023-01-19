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

    public void startMoving(){
        System.out.println("Автобус - " + getModel() + " " + getBrand() +  " начал движение");
    }

    public void endMoving() {
        System.out.println("Автобус - " + getModel() + " " + getBrand() +  " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("пит-стоп автобуса  " + getBrand() + " " + getModel());
    }

    @Override
    public void bestLapTime() {

        System.out.println("Лучшее время круга автобуса " + getModel() + " " + getBrand() + " = " + ((int)((Math.random()  * 20 + 10)) + " мин."));
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость машины  " + getModel() + " " + getBrand() + " = " + ((int)(Math.random() * 100 + 35)) + " км/ч");
    }
}
