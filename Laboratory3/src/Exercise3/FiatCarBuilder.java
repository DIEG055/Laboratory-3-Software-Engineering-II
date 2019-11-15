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
public class FiatCarBuilder implements CarBuilder{
    
    private Car car;
    
    public FiatCarBuilder(){
        this.car = new Car();
    }
    
    @Override
    public void assembleChassis() {
        car.setChassis("Alumino");
    }

    @Override
    public void assembleEngine() {
        car.setEngine("600 Horse Power - Corriente");
    }

    @Override
    public void assembleBrakes() {
        car.setBrakes("Semi automaticos");
    }

    @Override
    public void assembleWheels() {
        car.setWheels("Goma de polipropileno");
    }

    @Override
    public Car getCar() {
        return this.car;
    }
    
}