package transport;

public class PassengerCar extends Transport implements Competing {
    public PassengerCar(String brand, String model, Double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void pitStop() {
        System.out.println("пит-стоп легковой машины  " + getBrand() + " " + getModel());
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга легковой машины "
                + getModel() + " " + getBrand() + " = " + ((int)((Math.random()  * 5 + 5)) + " мин."));
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость машины  " + getModel() + " " + getBrand() + " = " + ((int)(Math.random() * 100 + 100)) + " км/ч");
    }

    public void startMoving(){
        System.out.println("Машина - " + getModel() + " " + getBrand() +  " начала движение");
    }

    public void endMoving(){
        System.out.println("Машина - " + getModel() + " " + getBrand() +  " закончила движение");
    }
}
