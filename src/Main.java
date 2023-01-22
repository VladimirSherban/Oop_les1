import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;
import transport.*;

public class Main {
    public static void main(String[] args) {

        PassengerCar audiA8 = new PassengerCar("Audi", "A8", 3.0, PassengerCarBodyType.SEDAN, null);
        PassengerCar toyotaCorolla = new PassengerCar("Toyota", "Corolla", 1.6, PassengerCarBodyType.UNIVERSAL, TransportType.PASSENGER_CAR);
        PassengerCar fordMustang = new PassengerCar("Ford", "Mustang", 5.0, PassengerCarBodyType.UNIVERSAL, TransportType.PASSENGER_CAR);
        PassengerCar chevroletCamaro = new PassengerCar("Chevrolet", "Camaro", 6.2, PassengerCarBodyType.CROSSOVER, TransportType.PASSENGER_CAR);

        Bus citroenJumpy = new Bus("Citroen", "Jumpy", 2.0, CapacityBus.BIG, null);
        Bus hyundaiH350 = new Bus("Hyundai", "H350", 2.5, CapacityBus.AVERAGE, TransportType.BUS);
        Bus hyundaiPorter = new Bus("Hyundai", "Porter", 2.1, CapacityBus.VERY_BIG, TransportType.BUS);
        Bus hyundaiCounty = new Bus("Hyundai", "County", 2.1, CapacityBus.SMALL, TransportType.BUS);

        Truck caterpillarCT630LS = new Truck("Caterpillar", "CT630LS", 16.1, LoadCapacity.N1, TransportType.TRUCK);
        Truck westernStar = new Truck("western", "Star", 14.5, LoadCapacity.N2, TransportType.TRUCK);
        Truck mackAnthem = new Truck("mack", "Anthem", 12.1, LoadCapacity.N3, TransportType.TRUCK);
        Truck brockway360 = new Truck("brockway", "360", 11.5, LoadCapacity.N1, TransportType.TRUCK);

        DriverB mihailVladimirovich = new DriverB("Михаил Владимирович", true, "3 года");
        DriverC artemAlekseevich = new DriverC("Артем Алексеевич", true, "5 лет");
        DriverD vladimirDmitrievich = new DriverD("Владимир Дмитриевич", true, "8 лет");

        System.out.println(audiA8);

        System.out.println(caterpillarCT630LS);
        System.out.println(westernStar);
        System.out.println(mackAnthem);
        System.out.println(brockway360);

        System.out.println(citroenJumpy);
        System.out.println(hyundaiH350);
        System.out.println(hyundaiPorter);
        System.out.println(hyundaiCounty);

        audiA8.printType();

//        mihailVladimirovich.showInfo(toyotaCorolla);
//        artemAlekseevich.showInfo(westernStar);
//        vladimirDmitrievich.showInfo(citroenJumpy);
//
//        citroenJumpy.startMoving();
//        audiA8.startMoving();
//        caterpillarCT630LS.startMoving();
//
//        citroenJumpy.bestLapTime();
//        citroenJumpy.maxSpeed();
//        audiA8.bestLapTime();
//        audiA8.maxSpeed();
//        caterpillarCT630LS.bestLapTime();
//        caterpillarCT630LS.maxSpeed();
//        citroenJumpy.pitStop();
//        audiA8.pitStop();
//        caterpillarCT630LS.pitStop();
//
//        citroenJumpy.endMoving();
//        audiA8.endMoving();
//        caterpillarCT630LS.endMoving();
    }
}
