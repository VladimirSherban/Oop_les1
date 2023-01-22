package transport;

public enum LoadCapacity {

    N1(0f, 3.5f),
    N2(3.5f, 12f),
    N3(12f, null);

    private final Float fromWeight;
    private final Float beforeWeight;

    LoadCapacity(Float fromWeight, Float beforeWeight) {
        this.fromWeight = fromWeight;
        this.beforeWeight = beforeWeight;
    }

    @Override
    public String toString() {
        return "Грузоподъемность{" + "от = " + (fromWeight == null ? "Нижняя граница" : fromWeight) +
                ", до =" + (beforeWeight == null ? "Верхняя граница" : beforeWeight) + " тонн" + '}';
    }
}
