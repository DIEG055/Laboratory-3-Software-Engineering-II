
package Exercise1.Vehicles;

import Exercise1.VehicleStrategy;

/**
 *
 * @author Juan Diego Medina Naranjo
 */
public class Bus implements VehicleStrategy {

    public Bus() {
    }

    @Override
    public void goToAirport(float b, float t) {
        System.out.println("I go to Airport by BUS!" + " with a budget of " + b + " and I can't spend more than " + t + " minutes\n");
    }

}
