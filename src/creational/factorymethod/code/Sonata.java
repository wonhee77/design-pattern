package creational.factorymethod.code;

import java.time.LocalDate;

public class Sonata implements Car {

    private final LocalDate manufactureDate = LocalDate.of(2002, 3, 15);

    @Override
    public LocalDate getManufactureDate() {
        return manufactureDate;
    }
}
