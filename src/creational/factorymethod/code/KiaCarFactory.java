package creational.factorymethod.code;

public class KiaCarFactory implements CarFactory {

    @Override
    public Car makeACar() {
        return new K5();
    }
}
