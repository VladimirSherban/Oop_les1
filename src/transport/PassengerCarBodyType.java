package transport;

public enum PassengerCarBodyType {

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

    PassengerCarBodyType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return carType;
    }
}
