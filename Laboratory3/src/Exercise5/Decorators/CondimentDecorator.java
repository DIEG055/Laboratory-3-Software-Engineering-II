
package Exercise5.Decorators;

import Exercise5.Coffee.Beverage;

public abstract class CondimentDecorator extends Beverage {
	Beverage beverage;
	public abstract String getDescription();
}

