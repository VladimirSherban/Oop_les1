public class Main {
    public static void main(String[] args) {

        Car ladaGranta = new Car("Lada", "Granta", 1.7,
                "Желтый", 2015, "Россия");

        Car audiA8 = new Car("Audi", "A8", 3.0,
                "черный", 2020, "Германия");

        Car bMWZ8 = new Car("BMW", "Z8", 3.0,
                "черный", 2021, "Германия");

        Car kiaSportage = new Car("Kia", "Sportage 4", 2.4,
                "красный", 2018, "Южная Корея");

        Car hyundaiAvante = new Car(null, "", -1.3,
                "  ", -23, "   ");

        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bMWZ8);
        System.out.println(kiaSportage);
        System.out.println(hyundaiAvante);


    }
}
