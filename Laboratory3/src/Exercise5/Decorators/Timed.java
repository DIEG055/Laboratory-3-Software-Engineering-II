
package Exercise5.Decorators;

import Exercise5.Decorators.CondimentDecorator;
import Exercise5.Coffee.Beverage;

public class Timed extends CondimentDecorator {
	public Timed(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", >2 min";
	}
 
	public double cost() {
		return .20 + beverage.cost();
	}
}

