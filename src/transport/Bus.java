package transport;

public class Bus extends Transport{

   private final Integer numberOfSeats;

    public Bus(String brand, String model, Integer year, String country, String color, Integer maxSpeed, Integer numberOfSeats) {
        super(brand, model, year, country, color, maxSpeed);

        if (numberOfSeats < 0){
            this.numberOfSeats = 8;
        }else{
            this.numberOfSeats = numberOfSeats;
        }
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand=" + getBrand() + '\'' +
                ", model=" + getModel() + '\'' +
                ", year=" + getYear() + '\'' +
                ", country='" + getCountry() + '\'' +
                ", color='" + getColor() + '\'' +
                ", maxSpeed=" + getMaxSpeed() +
                ", numberOfSeats=" + numberOfSeats +
                '}';
    }
}
