
package Exercise2.PizzaStore.Stores;

import Exercise2.PizzaStore.PizzaStyle.Chicago.ChicagoStyleCheesePizza;
import Exercise2.PizzaStore.PizzaStyle.Chicago.ChicagoStyleClamPizza;
import Exercise2.PizzaStore.PizzaStyle.Chicago.ChicagoStylePepperoniPizza;
import Exercise2.PizzaStore.PizzaStyle.Chicago.ChicagoStyleVeggiePizza;
import Exercise2.PizzaStore.PizzaStyle.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
        	if (item.equals("cheese")) {
            		return new ChicagoStyleCheesePizza();
        	} else if (item.equals("veggie")) {
        	    	return new ChicagoStyleVeggiePizza();
        	} else if (item.equals("clam")) {
        	    	return new ChicagoStyleClamPizza();
        	} else if (item.equals("pepperoni")) {
            		return new ChicagoStylePepperoniPizza();
        	} else return null;
	}
}