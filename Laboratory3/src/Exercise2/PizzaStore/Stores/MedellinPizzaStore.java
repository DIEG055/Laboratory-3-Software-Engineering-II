
package Exercise2.PizzaStore.Stores;

import Exercise2.PizzaStore.PizzaStyle.Medellin.MedellinStyleBandejaPaisaPizza;
import Exercise2.PizzaStore.PizzaStyle.Medellin.MedellinStyleChorizoPizza;
import Exercise2.PizzaStore.PizzaStyle.Medellin.MedellinStyleGroundBeefPizza;
import Exercise2.PizzaStore.PizzaStyle.Medellin.MedellinStylePorkRindPizza;
import Exercise2.PizzaStore.PizzaStyle.Pizza;

public class MedellinPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
        	if (item.equals("bandeja paisa")) {
            		return new MedellinStyleBandejaPaisaPizza();
        	} else if (item.equals("ground beef")) {
        	    	return new MedellinStyleGroundBeefPizza();
        	} else if (item.equals("pork rind")) {
        	    	return new MedellinStylePorkRindPizza();
        	} else if (item.equals("chorizo")) {
            		return new MedellinStyleChorizoPizza();
        	} else return null;
	}
}
