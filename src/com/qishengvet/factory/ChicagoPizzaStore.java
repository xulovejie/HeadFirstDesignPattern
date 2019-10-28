package com.qishengvet.factory;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza;
		switch (type) {
		case "cheese":
			pizza = new ChicagoStyleCheesePizza();
			break;

		default:
			pizza = null;
			break;
		}

		return pizza;
	}

}
