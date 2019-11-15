
package Exercise5.Decorators;

import Exercise5.Decorators.CondimentDecorator;
import Exercise5.Coffee.Beverage;

public class Figure extends CondimentDecorator {
	public Figure(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Figure";
	}
 
	public double cost() {
		return .20 + beverage.cost();
	}
}

