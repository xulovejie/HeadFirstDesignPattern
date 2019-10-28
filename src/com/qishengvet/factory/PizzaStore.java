package com.qishengvet.factory;

public abstract class PizzaStore {
	public final Pizza orderPizza(String type) {
		Pizza pizza = null;
		pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	protected abstract Pizza createPizza(String type);
}
