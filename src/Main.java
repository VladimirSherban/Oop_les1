import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;
import transport.Bus;
import transport.PassengerCar;
import transport.Truck;

public class Main {
    public static void main(String[] args) {

        PassengerCar audiA8 = new PassengerCar("Audi", "A8", 3.0);
        PassengerCar toyotaCorolla = new PassengerCar("Toyota", "Corolla", 1.6);
        PassengerCar fordMustang = new PassengerCar("Ford", "Mustang", 5.0);
        PassengerCar chevroletCamaro = new PassengerCar("Chevrolet", "Camaro", 6.2);

        Bus citroenJumpy = new Bus("Citroen", "Jumpy", 2.0);
        Bus hyundaiH350 = new Bus("Hyundai", "H350", 2.5);
        Bus hyundaiPorter = new Bus("Hyundai", "Porter", 2.1);
        Bus hyundaiCounty = new Bus("Hyundai", "County", 2.1);

        Truck caterpillarCT630LS = new Truck("Caterpillar", "CT630LS", 16.1);
        Truck westernStar = new Truck("western", "Star", 14.5);
        Truck mackAnthem = new Truck("mack", "Anthem", 12.1);
        Truck brockway360 = new Truck("brockway", "360", 11.5);

        DriverB<PassengerCar> mihailVladimirovich = new DriverB<>("Михаил Владимирович", true, "3 года");
        DriverC<Truck> artemAlekseevich = new DriverC<>("Артем Алексеевич", true, "5 лет");
        DriverD<Bus> vladimirDmitrievich = new DriverD<>("Владимир Дмитриевич", true, "8 лет");

        mihailVladimirovich.showInfo(toyotaCorolla);
        artemAlekseevich.showInfo(westernStar);
        vladimirDmitrievich.showInfo(citroenJumpy);

        audiA8.bestLapTime(234);
        citroenJumpy.maxSpeed(189);
        westernStar.pitStop();
        brockway360.startMoving();
        brockway360.endMoving();

    }
}

