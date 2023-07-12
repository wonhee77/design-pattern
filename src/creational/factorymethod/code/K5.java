package creational.factorymethod.code;

import java.time.LocalDate;

public class K5 implements Car {

    private final LocalDate manufactureDate = LocalDate.of(2000, 2, 15);

    @Override
    public LocalDate getManufactureDate() {
        return manufactureDate;
    }
}
