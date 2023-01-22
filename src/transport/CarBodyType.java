package transport;

public enum CarBodyType {

    SEDAN("Седан"),
    HATCHBACK("Хэтчбек"),
    COUPE("Купе"),
    UNIVERSAL("Универсал"),
    OFF_ROAD_VEHICLE("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("минивен");

    private final String carType;

    CarBodyType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return carType;
    }

    public String getCarType() {
        return carType;
    }
}
