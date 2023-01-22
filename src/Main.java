import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;
import Drivers.LicenseType;
import transport.*;

public class Main {
    public static void main(String[] args) {

        PassengerCar audiA8 = new PassengerCar("Audi", "A8", 3.0, null);
        PassengerCar toyotaCorolla = new PassengerCar("Toyota", "Corolla", 1.6, CarBodyType.UNIVERSAL);
        PassengerCar fordMustang = new PassengerCar("Ford", "Mustang", 5.0, CarBodyType.UNIVERSAL);
        PassengerCar chevroletCamaro = new PassengerCar("Chevrolet", "Camaro", 6.2, CarBodyType.CROSSOVER);

        Bus citroenJumpy = new Bus("Citroen", "Jumpy", 2.0, CapacityBus.BIG, CarBodyType.MINIVAN);
        Bus hyundaiH350 = new Bus("Hyundai", "H350", 2.5, CapacityBus.AVERAGE, CarBodyType.MINIVAN);
        Bus hyundaiPorter = new Bus("Hyundai", "Porter", 2.1, CapacityBus.VERY_BIG, CarBodyType.MINIVAN);
        Bus hyundaiCounty = new Bus("Hyundai", "County", 2.1, CapacityBus.SMALL, CarBodyType.MINIVAN);

        Truck caterpillarCT630LS = new Truck("Caterpillar", "CT630LS", 16.1, LoadCapacity.N1, CarBodyType.VAN);
        Truck westernStar = new Truck("western", "Star", 14.5, LoadCapacity.N2, CarBodyType.VAN);
        Truck mackAnthem = new Truck("mack", "Anthem", 12.1, LoadCapacity.N3, CarBodyType.VAN);
        Truck brockway360 = new Truck("brockway", "360", 11.5, LoadCapacity.N1, CarBodyType.VAN);

        DriverB mihailVladimirovich = new DriverB("Михаил Владимирович", true, "3 года", LicenseType.B);
        DriverC artemAlekseevich = new DriverC("Артем Алексеевич", true, "5 лет", LicenseType.C);
        DriverD vladimirDmitrievich = new DriverD("Владимир Дмитриевич", true, "8 лет", LicenseType.D);


        audiA8.getDiagnosed(mihailVladimirovich);
        audiA8.getDiagnosed(artemAlekseevich);

        System.out.println(mihailVladimirovich);

        mihailVladimirovich.showInfo(audiA8);

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
