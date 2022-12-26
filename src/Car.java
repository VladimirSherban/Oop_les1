public class Car {

    String brand;
    String model;
    Double engineVolume;
    String color;
    Integer year;
    String country;

    public Car(String brand, String model, Double engineVolume, String color, Integer year, String country) {

        if (model == null || model.trim().isEmpty()){
           model = " Не указана модель ";
        }

        if (brand == null || brand.trim().isEmpty()){
            brand = " Не указан бренд ";
        }

        if (country == null || country.trim().isEmpty()){
            country = " Не указана страна ";
        }

        if (engineVolume <= 0){
            engineVolume = 1.5;
        }
        if (color == null || color.trim().isEmpty()){
            color = "белый";
        }
        if (year <= 0){
            year = 2000;
        }
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }
}
