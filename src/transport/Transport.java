package transport;

public class Transport {

    private final String brand;
    private final String model;
    private Double engineVolume;

    public Transport(String brand, String model, Double engineVolume) {

        setEngineVolume(engineVolume);

        if (model == null || model.trim().isEmpty()) {
            this.model = "Не указана модель";
        } else {
            this.model = model;
        }

        if (brand == null || brand.trim().isEmpty()) {
            this.brand = "Не указан бренд";
        } else {
            this.brand = brand;
        }
    }

    public void startMoving(){
        System.out.println(getModel() + " " + getBrand() +  " начал движение");
    }

    public void endMoving(){
        System.out.println(getModel() + " " + getBrand() +  " закончил движение");
    }

    public void setEngineVolume(Double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public final String getBrand() {
        return brand;
    }

    public final String getModel() {
        return model;
    }

    public final Double getEngineVolume() {
        return engineVolume;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
