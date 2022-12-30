package transport;

import java.util.Calendar;
import java.util.Objects;

public class Car {

   public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

       public boolean isRemoteEngineStart() {
           return remoteEngineStart;
       }

       public boolean isKeylessAccess() {
           return keylessAccess;
       }

       @Override
       public String toString() {
           return "Key{" +
                   "remoteEngineStart=" + remoteEngineStart +
                   ", keylessAccess=" + keylessAccess +
                   '}';
       }
   }

    private final String brand;
    private final String model;
    private Double engineVolume;
    private String color;
    private final Integer year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final Integer numberOfSeats;
    private boolean winterTires = false;
    private final Key key;

    public Car(String brand, String model, Double engineVolume, String color,
               Integer year, String country, String bodyType, Integer numberOfSeats,
               String registrationNumber, String transmission, Key key) {

        this.key = Objects.requireNonNullElseGet(key, () -> new Key(false, false));

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

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (color == null || color.trim().isEmpty()) {
            this.color = "белый";
        } else {
            this.color = color;
        }

        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }

        if (bodyType == null || bodyType.trim().isEmpty()) {
            this.bodyType = "Укажите тип кузова";
        } else {
            this.bodyType = bodyType;
        }

        if (numberOfSeats == null || numberOfSeats <= 0) {
            this.numberOfSeats = 4;
        } else {
            this.numberOfSeats = numberOfSeats;
        }

        if (registrationNumber == null || registrationNumber.trim().isEmpty()) {
            this.registrationNumber = "0ooo0_00";
        } else {
            this.registrationNumber = registrationNumber;
        }

        if (transmission == null || transmission.trim().isEmpty()) {
            this.transmission = "укажите коробку передач";
        } else {
            this.transmission = transmission;
        }

        putOnWinterTires();
    }

    public void putOnWinterTires() {
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH) + 1;
        if (month == 1 || month == 2 || month == 12) {
            winterTires = true;
        }
    }

    public void setEngineVolume(Double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }

    public Key getKey() {
        return key;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public Integer getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isWinterTires() {
        return winterTires;
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
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", winterTires=" + winterTires +
                ", key=" + key +
                '}';
    }
}

