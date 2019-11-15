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
public class ChevroletCarBuilder implements CarBuilder{
    
    private Car car;
    
    public ChevroletCarBuilder(){
        this.car = new Car();
    }
    
    @Override
    public void assembleChassis() {
        car.setChassis("Fibra de Titanio");
    }

    @Override
    public void assembleEngine() {
        car.setEngine("150 Horse Power - diesel");
    }

    @Override
    public void assembleBrakes() {
        car.setBrakes("Automaticos");
    }

    @Override
    public void assembleWheels() {
        car.setWheels("Goma comprimida");
    }

    @Override
    public Car getCar() {
        return this.car;
    }
    
}
