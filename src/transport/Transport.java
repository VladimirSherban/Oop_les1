package transport;

public class Transport {

    private final String brand;
    private final String model;
    private final Integer year;
    private final String country;
    private String color;
    private Integer maxSpeed;


    public Transport(String brand, String model, Integer year, String country, String color, Integer maxSpeed) {

        setColor(color);
        setMaxSpeed(maxSpeed);

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

        if (country == null || country.trim().isEmpty()) {
            this.country = "Не указана страна";
        } else {
            this.country = country;
        }

        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
    }

    public void setColor(String color) {
        if (color == null || color.trim().isEmpty()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public void setMaxSpeed(Integer maxSpeed) {
       if (maxSpeed == null || maxSpeed <= 0){
           this.maxSpeed = 100;
       }else {
           this.maxSpeed = maxSpeed;
       }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
