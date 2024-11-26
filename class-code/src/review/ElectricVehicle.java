package review;

import java.util.Collection;

public interface ElectricVehicle extends Collection {

//    by default public and abstract
    void chargeCar(int charge);

    String getCarName();

}
