package Exercise1;

import Exercise1.Vehicles.*;

public class Client {

//  Strategy Object, it defines the vehicle
    private TransportContext transport;
    private float budget;
    private float time;

    public Client() {
        this.transport = new TransportContext();
    }

    /*    Algorithm use to choose an specific Strategy(Vehicle)
      according to the constraints*/
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
        this.transport.goToDestination();
    }

}
