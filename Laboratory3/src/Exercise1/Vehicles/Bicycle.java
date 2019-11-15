package Exercise1.Vehicles;

import Exercise1.VehicleStrategy;

public class Bicycle implements VehicleStrategy {

    public Bicycle() {
    }

    @Override
    public void goToAirport() {
        System.out.println("I go to Airport by BICYCLE!");
    }

}
