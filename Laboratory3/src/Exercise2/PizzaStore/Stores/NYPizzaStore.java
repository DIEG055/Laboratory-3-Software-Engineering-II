
package Exercise2.PizzaStore.Stores;

import Exercise2.PizzaStore.PizzaStyle.NewYork.NYStyleCheesePizza;
import Exercise2.PizzaStore.PizzaStyle.NewYork.NYStyleClamPizza;
import Exercise2.PizzaStore.PizzaStyle.NewYork.NYStylePepperoniPizza;
import Exercise2.PizzaStore.PizzaStyle.NewYork.NYStyleVeggiePizza;
import Exercise2.PizzaStore.PizzaStyle.Pizza;


public class NYPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else return null;
	}
}