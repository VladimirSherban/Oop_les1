import transport.Car;


public class Main {
    public static void main(String[] args) {


        Car ladaGranta = new Car("Lada", "Granta", 1.7,
                "Желтый", 2015, "Россия", "Седан", 5,
                "1аам23_01", "автоматическая коробка передач",
                new Car.Key(false, false));

        Car audiA8 = new Car("Audi", "A8", 3.0,
                "черный", 2020, "Германия", "Хетчбек", 6,
                "9арн12_93", "автоматическая коробка передач",
                new Car.Key(true, true));

        Car bMWZ8 = new Car("BMW", "Z8", 3.0,
                "черный", 2021, "Германия", "Седан", 6,
                "0хам01_103", "вариативная коробка передач",
                new Car.Key(true, false));

        Car kiaSportage = new Car("Kia", "Sportage 4", 2.4,
                "красный", 2018, "Южная Корея", "Седан", 5,
                "5ррн23_93", "механическая коробка передач",
                new Car.Key(false, true));

        Car hyundaiAvante = new Car(null, "", -1.3,
                "  ", -23, "   ", "", -6,
                "     ", "", new Car.Key(false,
                false));



        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bMWZ8);
        System.out.println(kiaSportage);
        System.out.println(hyundaiAvante);


    }
}

