import transport.Bus;
import transport.Car;


public class Main {
    public static void main(String[] args) {


        Car ladaGranta = new Car(1.7, "Седан", 5, "1арн23_01", "автоматическая коробка передач",
                false, true, "Lada", "Granta", 2015, "Россия", "Желтый", 140);

        Car audiA8 = new Car(0.0, null, null, null, "", false, false,
                "", null, -1000, "", null, -140);

        Bus hyundaiCounty = new Bus("Hyundai", "County", 2020, "Корея", "Белый", 150, 18);

        Bus uaz = new Bus("УАЗ", "2206", 2003, "Россия", "Серый", 120, 8);

        Bus mercedesSprinter = new Bus(" Mercedes-Benz", "Sprinter Classic", 2015, "Германия", "Белый", 150, 12);

        Bus check = new Bus("", "", -99, null, "Белый", -66, -7);


        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(hyundaiCounty);
        System.out.println(uaz);
        System.out.println(mercedesSprinter);
        System.out.println(check);


    }
}

