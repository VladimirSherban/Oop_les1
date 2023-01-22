package transport;

public enum TransportType {
    BUS("Автобус"),
    TRUCK("Грузовик"),
    PASSENGER_CAR("Легковой автомобиль");

    private final String name;

    TransportType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
