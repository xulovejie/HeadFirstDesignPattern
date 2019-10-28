package com.qishengvet.simplefactory;

public class PizzaStore {
	SimplePizzaFactory factory;
	
	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}
	
	
	public static void main(String[] args) {
		PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
		pizzaStore.orderPizza("cheese");
	}
	
	Pizza orderPizza(String typeString) {
		Pizza pizza;
//		if(typeString.equals("cheese")) {
//			pizza = new CheesePizza();
//		}else {
//			pizza = new GreeKPizza();
//		}
		pizza = factory.createPizza(typeString);
		
		if(pizza == null) {
			throw new RuntimeException("Create pizza failed");
		}
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
}
