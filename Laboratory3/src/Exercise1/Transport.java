
package Exercise1;

/**
 *
 * @author Juan Diego Medina Naranjos
 */
public class Transport {

    private VehicleStrategy vehicle;

    public Transport() {
    }

    public void setVehicle(VehicleStrategy transportBehaviour) {
        this.vehicle = transportBehaviour;
    }

    public void goToDestination(float b, float t) {
        this.vehicle.goToAirport(b, t);
    }

}
