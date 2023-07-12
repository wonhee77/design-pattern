package creational.factorymethodpattern.impl;

public class KiaCarFactory implements CarFactory {

    @Override
    public Car makeACar() {
        return new K5();
    }
}
