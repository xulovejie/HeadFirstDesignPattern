package com.qishengvet.factory;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza;
		switch (type) {
		case "cheese":
			pizza = new NYStyleCheesePizza();
			break;

		default:
			pizza = null;
			break;
		}

		return pizza;
	}

}
