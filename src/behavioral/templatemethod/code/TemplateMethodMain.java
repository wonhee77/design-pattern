package behavioral.templatemethod.code;

public class TemplateMethodMain {

    public static void main(String[] args) {
        ElectricCarFactory electricCarFactory = new ElectricCarFactory();
        Car electricCar = electricCarFactory.makeACar();
        System.out.println("[Electric car]");
        System.out.println("EnergySource : " + electricCar.getEnergySource());
        System.out.println("Frame  : " + electricCar.getFrame());
        System.out.println("Color : " + electricCar.getColor());

        InternalCombustionCarFactory carFactory = new InternalCombustionCarFactory();
        Car car = carFactory.makeACar();
        System.out.println("[Internal combustion car]");
        System.out.println("EnergySource : " + car.getEnergySource());
        System.out.println("Frame  : " + car.getFrame());
        System.out.println("Color : " + car.getColor());
    }
}
