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
public class main {
    public static void main(String[] args) {
        
        //Construccion de la fabrica de carros        
        CarsFactory factory = new CarsFactory();
        
        
        //Construccion de un carro de marcha crevrolet        
        CarBuilder chevroletBuilder = new ChevroletCarBuilder();
        factory.setCarBuilder(chevroletBuilder);
        factory.constructCar();
        Car chevroletCar = factory.getCar();
        System.out.println("Chevrolet Car" + chevroletCar);
        
        
        //Contruccion de un carro de marca Fiat        
        CarBuilder fiatBuilder = new FiatCarBuilder();
        factory.setCarBuilder(fiatBuilder);
        factory.constructCar();
        Car fiatCar = factory.getCar();
        System.out.println("\n\nFiat Car" + fiatCar);
        
        //Contruccion de un carro marca Nissan
        CarBuilder nissanBuilder = new NissanBuilderCar();
        factory.setCarBuilder(nissanBuilder);
        factory.constructCar();
        Car nissanCar = factory.getCar();
        System.out.println("\n\nNissan Car" + nissanCar);
    }
}
