package com.qishengvet.simplefactory;

public class SimplePizzaFactory {
	public Pizza createPizza(String typeString) {
		Pizza pizza = null;
		if(typeString.equals("cheese")) {
			pizza = new CheesePizza();
		}else if (typeString.equals("greek")) {
			pizza = new GreeKPizza();
		}
		
		return pizza;
	}
}
