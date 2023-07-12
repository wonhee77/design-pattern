package behavioral.templatemethod.code;

public class ElectricCarFactory extends CarFactory {

    public Car makeACar() {
        Car car = new Car();
        makeFrame(car);
        paintCar(car);
        buildSteering(car);
        setEnergySource(car);
        return car;
    }

    private void makeFrame(Car car) {
        car.setFrame("frame");
    }

    private void paintCar(Car car) {
        car.setColor("white");
    }

    private void buildSteering(Car car) {
        car.setSteeringSystem("steering");
    }

    @Override
    protected void setEnergySource(Car car){
        car.setEnergySource("battery");
    }
}
