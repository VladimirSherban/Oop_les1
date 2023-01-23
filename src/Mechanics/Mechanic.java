package Mechanics;

import transport.Transport;

public class Mechanic<T extends Transport> {

    private String name;
    private String company;

    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public void carryOutMaintenance(T transport) {
        System.out.println("Механик  " + getName() + " из комании " + getCompany() + " проводит техобслуживание транспорта " + transport.getModel() + " " + transport.getBrand());
    }

    public void prepareCar(T transport) {
        System.out.println("Механик  " + getName() + " из комании " + getCompany() + " починил машину - " + transport.getModel() + " " + transport.getBrand());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
