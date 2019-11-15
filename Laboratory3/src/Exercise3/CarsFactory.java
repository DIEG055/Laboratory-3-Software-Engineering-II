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
public class CarsFactory {
   private CarBuilder carBuilder;
   
   public CarsFactory(){
   }

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }
   
   
   
   public Car getCar(){
       return this.carBuilder.getCar();
   }
   
   public void constructCar(){
       this.carBuilder.assembleChassis();
       this.carBuilder.assembleEngine();
       this.carBuilder.assembleBrakes();
       this.carBuilder.assembleWheels();
   }
}
