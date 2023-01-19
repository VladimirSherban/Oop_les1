package transport;

public class Truck extends Transport implements Competing {
    public Truck(String brand, String model, Double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void pitStop() {
        System.out.println("пит-стоп грузовика  " + getBrand() + " " + getModel());
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга грузовика " + getModel() + " " + getBrand() +  " = " + ((int)((Math.random()  * 30 + 20)) + " мин."));
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость грузовика  " + getModel() + " " + getBrand() + " = " + ((int)(Math.random() * 10 + 70)) + " км/ч");
    }

    public void startMoving(){
        System.out.println("Грузовик - " + getModel() + " " + getBrand() +  " начал движение");
    }

    public void endMoving(){
        System.out.println("Грузовик - " + getModel() + " " + getBrand() +  " закончил движение");
    }
}
