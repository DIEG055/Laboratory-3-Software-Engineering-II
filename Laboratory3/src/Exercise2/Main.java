/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;

import Exercise2.PizzaStore.Stores.MedellinPizzaStore;
import Exercise2.PizzaStore.Stores.NYPizzaStore;
import Exercise2.PizzaStore.Stores.ChicagoPizzaStore;
import Exercise2.PizzaStore.Stores.PizzaStore;
import Exercise2.PizzaStore.PizzaStyle.Pizza;

/**
 *
 * @author julia
 */
public class Main {
    public static void main(String[] args) {		
	PizzaStore mdStore = new MedellinPizzaStore();
 
	Pizza pizza = mdStore.orderPizza("bandeja paisa");
	System.out.println("Ethan ordered a " + pizza.getName() + "\n");

	pizza = mdStore.orderPizza("ground beef");
	System.out.println("Ethan ordered a " + pizza.getName() + "\n");

	pizza = mdStore.orderPizza("pork rind");
	System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
	pizza = mdStore.orderPizza("chorizo");
	System.out.println("Ethan ordered a " + pizza.getName() + "\n");
        
        PizzaStore nyStore = new NYPizzaStore();
	PizzaStore chicagoStore = new ChicagoPizzaStore();
 
	pizza = nyStore.orderPizza("cheese");
	System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
	pizza = chicagoStore.orderPizza("cheese");
	System.out.println("Joel ordered a " + pizza.getName() + "\n");

	pizza = nyStore.orderPizza("clam");
	System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
	pizza = chicagoStore.orderPizza("clam");
	System.out.println("Joel ordered a " + pizza.getName() + "\n");

	pizza = nyStore.orderPizza("pepperoni");
	System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
	pizza = chicagoStore.orderPizza("pepperoni");
	System.out.println("Joel ordered a " + pizza.getName() + "\n");

	pizza = nyStore.orderPizza("veggie");
	System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
	pizza = chicagoStore.orderPizza("veggie");
	System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
