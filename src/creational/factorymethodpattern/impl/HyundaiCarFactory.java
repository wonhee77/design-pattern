package creational.factorymethodpattern.impl;

public class HyundaiCarFactory implements CarFactory {

    @Override
    public Car makeACar() {
        return new Sonata();
    }
}
