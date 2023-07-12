package creational.factorymethod.code;

public class HyundaiCarFactory implements CarFactory {

    @Override
    public Car makeACar() {
        return new Sonata();
    }
}
