package creational.factorymethod.code;

public class FactoryMethodMain {

    public static void main(String[] args) {
        CarFactory carFactory = new HyundaiCarFactory();
        Car car = carFactory.makeACar();
        System.out.println("ManufactureDate : " + car.getManufactureDate());
    }
}
