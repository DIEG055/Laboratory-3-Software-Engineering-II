package Exercise1;

public class TransportContext {

    /*  TransportContext Class is a intermediary class between the Client and the 
    VehicleStrategy Class. It allows that if a new type of client is implemented,
    it will be able to use any vehicle(strategy) avaliable because It doesn't
    take care of specific Strategies(Vehicles).*/
    
    private VehicleStrategy vehicle;

    public TransportContext() {
    }

    public void setVehicle(VehicleStrategy transportBehaviour) {
        this.vehicle = transportBehaviour;
    }

    public void goToDestination() {
        this.vehicle.goToAirport();
    }

}
