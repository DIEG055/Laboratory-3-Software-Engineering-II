package Exercise1;

import Exercise1.Vehicles.*;

/**
 *
 * @author Juan Diego Medina Naranjo
 */
public class Client {

//  Strategy Object, it defines the vehicle
    private Transport transport;
    
    private float budget;
    private float time;

    public Client() {
        this.transport = new Transport();
    }

//    Algorithm to define the type of vehicle according to the constraints
    public void orderVehicle(float budget, float time) {
        this.time = time;
        this.budget = budget;
        if (budget >= 15000.0 && time <= 30.0) {
            this.transport.setVehicle(new Cab());
        } else if (budget >= 5000.0 && time <= 60.0) {
            this.transport.setVehicle(new Bus());
        } else {
            this.transport.setVehicle(new Bicycle());
        }
    }

    public void goToAirport() {
        this.transport.goToDestination(budget, time);
    }

}
