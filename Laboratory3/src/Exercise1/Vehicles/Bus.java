package Exercise1.Vehicles;

import Exercise1.VehicleStrategy;

public class Bus implements VehicleStrategy {

    public Bus() {
    }

    @Override
    public void goToAirport() {
        System.out.println("I go to Airport by BUS!");
    }

}
