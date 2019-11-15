package Exercise1.Vehicles;

import Exercise1.VehicleStrategy;

public class Cab implements VehicleStrategy {

    public Cab() {
    }

    @Override
    public void goToAirport() {
        System.out.println("I go to Airport by CAB!");
    }

}
