/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise3;

/**
 *
 * @author Camilo
 */
public class Car {
    private String chassis; 
    private String engine;
    private String brakes;
    private String wheels;

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setBrakes(String brakes) {
        this.brakes = brakes;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString(){
        return "\nChasiss: " + this.chassis + 
               "\nEngine: " + this.engine +
               "\nBrakes: " + this.brakes +
               "\nWheels: " + this.wheels;
    }
    
}
