
package Exercise5;

import Exercise5.Decorators.Timed;
import Exercise5.Decorators.Mocha;
import Exercise5.Decorators.Milk;
import Exercise5.Decorators.Figure;
import Exercise5.Coffee.Beverage;
import Exercise5.Coffee.Coffee;

public class Main {
    public static void sophisticationLevel(String value) {
		
		if(value.equals("Coffee")) {
			System.out.println("Simple");
		}else if(value.equals("Coffee, Milk")) {
			System.out.println("Elementary");
		}else if(value.equals("Coffee, Milk, >2 min")) {
			System.out.println("Sophisticated");
		}else if(value.equals("Coffee, >2 min")) {
			System.out.println("Basic");
		}else if(value.equals("Coffee, Milk, Mocha, Figure")) {
			System.out.println("Advanced");
		}else {
			System.out.println("Undefined beverage");
		}
		
	}

	public static void main(String[] args) {
		
		//System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		Beverage beverage = new Coffee();
		sophisticationLevel(beverage.getDescription());
		
		
		Beverage beverage2 = new Coffee();
		beverage2 = new Milk(beverage2);
		sophisticationLevel(beverage2.getDescription());
 
		Beverage beverage3 = new Coffee();
		beverage3 = new Milk(beverage3);
		beverage3 = new Timed(beverage3);
		sophisticationLevel(beverage3.getDescription());
		
		Beverage beverage4 = new Coffee();
		beverage4 = new Timed(beverage4);
		sophisticationLevel(beverage4.getDescription());
		
		Beverage beverage5 = new Coffee();
		beverage5 = new Milk(beverage5);
		beverage5 = new Mocha(beverage5);
		beverage5 = new Figure(beverage5);
		sophisticationLevel(beverage5.getDescription());
		
		Beverage beverage6 = new Coffee();
		beverage6 = new Mocha(beverage6);
		beverage6 = new Figure(beverage6);
		sophisticationLevel(beverage6.getDescription());

	}
}
