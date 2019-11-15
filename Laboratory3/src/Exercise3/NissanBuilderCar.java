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
public class NissanBuilderCar  implements CarBuilder{
    
    private Car car;
    
    public NissanBuilderCar(){
        this.car = new Car();
    }
    
    @Override
    public void assembleChassis() {
        car.setChassis("Hierro Fundido en Cobre");
    }

    @Override
    public void assembleEngine() {
        car.setEngine("300 Horse Power - Electrico");
    }

    @Override
    public void assembleBrakes() {
        car.setBrakes("Automaticos");
    }

    @Override
    public void assembleWheels() {
        car.setWheels("Propileno Comprimido");
    }

    @Override
    public Car getCar() {
        return this.car;
    }
    
}