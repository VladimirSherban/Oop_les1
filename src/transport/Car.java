package transport;

import java.util.Calendar;

public class Car extends Transport {

    public class Key {
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

    private Double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final Integer numberOfSeats;

    private boolean winterTires = false;
    private final Key key;


    public Car(Double engineVolume,
               String bodyType, Integer numberOfSeats,
               String registrationNumber, String transmission, Boolean remoteEngineStart,
               Boolean keylessAccess, String brand, String model, Integer year, String country, String color, Integer maxSpeed) {

        super(brand, model, year, country, color, maxSpeed);

        this.key = new Key(remoteEngineStart, keylessAccess);

        setTransmission(transmission);
        putOnWinterTires();
        setEngineVolume(engineVolume);
        setRegistrationNumber(registrationNumber);

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
    }

    public void putOnWinterTires() {
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH) + 1;
        if (month == 1 || month == 2 || month == 12) {
            winterTires = true;
        }
    }

    public void setEngineVolume(Double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.trim().isEmpty()) {
            this.transmission = "укажите коробку передач";
        } else {
            this.transmission = transmission;
        }
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.trim().isEmpty()) {
            this.registrationNumber = "0ooo0_00";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }

    public Key getKey() {
        return key;
    }


    public Double getEngineVolume() {
        return engineVolume;
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
                "brand=" + getBrand() + '\'' +
                ", model=" + getModel() + '\'' +
                ", year=" + getYear() + '\'' +
                ", country='" + getCountry() + '\'' +
                ", color='" + getColor() + '\'' +
                ", maxSpeed=" + getMaxSpeed() +
                ", engineVolume=" + engineVolume +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", numberOfSeats=" + numberOfSeats + '\'' +
                ", winterTires=" + winterTires + '\'' +
                ", key=" + key +
                '}';
    }
}

