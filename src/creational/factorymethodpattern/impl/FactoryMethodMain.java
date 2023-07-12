package creational.factorymethodpattern.impl;

public class FactoryMethodMain {

    public static void main(String[] args) {
        CarFactory carFactory = new HyundaiCarFactory();
        Car car = carFactory.makeACar();
        System.out.println("ManufactureDate : " + car.getManufactureDate());
    }
}
