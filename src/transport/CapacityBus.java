package transport;

public enum CapacityBus {

    ESPECIALLY_SMALL(null, 10),
    SMALL(null, 25),
    AVERAGE(40, 50),
    BIG(60, 80),
    VERY_BIG(100, 120);

    private final Integer from;
    private final Integer to;

    CapacityBus(Integer from, Integer to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return "Вместимость{" +
                "от =" + (from == null ? "нижняя граница" : from) +
                ", до=" + (to == null ? "верхняя граница" : to) +
                " мест" + '}';
    }
}
