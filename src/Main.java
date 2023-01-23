import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;
import Drivers.LicenseType;
import Mechanics.Mechanic;
import transport.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<PassengerCar> passengerCars = new ArrayList<>();
        List<Bus> busList = new ArrayList<>();
        List<Truck> truckList = new ArrayList<>();

        Mechanic<Truck> mechanicTruck = new Mechanic<>("Алексей Петрович", "N");
        Mechanic<Transport> transportMechanic = new Mechanic<>("Боб Евгеневич", "A");
        Mechanic<PassengerCar> passengerCarMechanic = new Mechanic<>("Алекс Петрович", "B");
        Mechanic<Bus> busMechanic = new Mechanic<>("Владимир Артемович", "F");


        DriverB mihailVladimirovich = new DriverB("Михаил Владимирович", true, "3 года", LicenseType.B);
        DriverC artemAlekseevich = new DriverC("Артем Алексеевич", true, "5 лет", LicenseType.C);
        DriverD vladimirDmitrievich = new DriverD("Владимир Дмитриевич", true, "8 лет", LicenseType.D);

        PassengerCar audiA8 = new PassengerCar("Audi", "A8", 3.0, CarBodyType.UNIVERSAL, mihailVladimirovich);
//        PassengerCar toyotaCorolla = new PassengerCar("Toyota", "Corolla", 1.6, CarBodyType.UNIVERSAL, mihailVladimirovich);
//        PassengerCar fordMustang = new PassengerCar("Ford", "Mustang", 5.0, CarBodyType.UNIVERSAL, mihailVladimirovich);
//        PassengerCar chevroletCamaro = new PassengerCar("Chevrolet", "Camaro", 6.2, CarBodyType.CROSSOVER, mihailVladimirovich);

        //Bus citroenJumpy = new Bus("Citroen", "Jumpy", 2.0, CapacityBus.BIG, CarBodyType.MINIVAN, vladimirDmitrievich);
//        Bus hyundaiH350 = new Bus("Hyundai", "H350", 2.5, CapacityBus.AVERAGE, CarBodyType.MINIVAN, vladimirDmitrievich);
//        Bus hyundaiPorter = new Bus("Hyundai", "Porter", 2.1, CapacityBus.VERY_BIG, CarBodyType.MINIVAN, vladimirDmitrievich);
//        Bus hyundaiCounty = new Bus("Hyundai", "County", 2.1, CapacityBus.SMALL, CarBodyType.MINIVAN, vladimirDmitrievich);

//        Truck caterpillarCT630LS = new Truck("Caterpillar", "CT630LS", 16.1, LoadCapacity.N1, CarBodyType.VAN, artemAlekseevich);
//        Truck westernStar = new Truck("western", "Star", 14.5, LoadCapacity.N2, CarBodyType.VAN, artemAlekseevich);
//        Truck mackAnthem = new Truck("mack", "Anthem", 12.1, LoadCapacity.N3, CarBodyType.VAN, artemAlekseevich);
//        Truck brockway360 = new Truck("brockway", "360", 11.5, LoadCapacity.N1, CarBodyType.VAN, artemAlekseevich);

        passengerCars.add(new PassengerCar("Audi", "A8", 3.0, CarBodyType.UNIVERSAL, mihailVladimirovich));
        busList.add(new Bus("Citroen", "Jumpy", 2.0, CapacityBus.BIG, CarBodyType.MINIVAN, vladimirDmitrievich));
        truckList.add(new Truck("Caterpillar", "CT630LS", 16.1, LoadCapacity.N1, CarBodyType.VAN, artemAlekseevich));

        busList.get(0).addMechanic(busMechanic);
        truckList.get(0).addMechanic(mechanicTruck);
        passengerCars.get(0).addMechanic(passengerCarMechanic);
        passengerCars.get(0).addMechanic(transportMechanic);

        passengerCars.get(0).showDriver();
        passengerCars.get(0).showMechanic();
        busList.get(0).showDriver();
        busList.get(0).showMechanic();
        truckList.get(0).showDriver();
        truckList.get(0).showMechanic();

        passengerCarMechanic.prepareCar(passengerCars.get(0));
        passengerCarMechanic.carryOutMaintenance(passengerCars.get(0));

        transportMechanic.carryOutMaintenance(passengerCars.get(0));
        transportMechanic.carryOutMaintenance(busList.get(0));
        mechanicTruck.carryOutMaintenance(truckList.get(0));

//        transportList.add(audiA8);
//        transportList.add(toyotaCorolla);
//        transportList.add(fordMustang);
//        transportList.add(chevroletCamaro);
//
//        transportList.add(citroenJumpy);
//        transportList.add(hyundaiH350);
//        transportList.add(hyundaiPorter);
//        transportList.add(hyundaiCounty);
//
//        transportList.add(chevroletCamaro);
//        transportList.add(westernStar);
//        transportList.add(mackAnthem);
//        transportList.add(brockway360);
//
//
//        try {
//            hyundaiCounty.getDiagnosed(vladimirDmitrievich);
//        } catch (CheckLicenseException e) {
//            System.out.println(e.getMessage());
//        }
//
//        try {
//            westernStar.getDiagnosed(mihailVladimirovich);
//        } catch (CheckLicenseException e) {
//            System.out.println(e.getMessage());
//        }
//
//        try {
//            audiA8.getDiagnosed(mihailVladimirovich);
//        } catch (CheckLicenseException e) {
//            System.out.println(e.getMessage());
//        }


//        System.out.println(mihailVladimirovich);
//
//        mihailVladimirovich.showInfo(audiA8);
//
//        System.out.println(audiA8);
//
//        System.out.println(caterpillarCT630LS);
//        System.out.println(westernStar);
//        System.out.println(mackAnthem);
//        System.out.println(brockway360);
//
//        System.out.println(citroenJumpy);
//        System.out.println(hyundaiH350);
//        System.out.println(hyundaiPorter);
//        System.out.println(hyundaiCounty);
//
//        audiA8.printType();


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
