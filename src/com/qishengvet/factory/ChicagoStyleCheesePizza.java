package com.qishengvet.factory;

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() {
		nameString = "Chicago Style Deep Dish Cheese Pizza";
		doughString = "Extra Thick Crust Dough";
		sauceString = "Plum Tomato Sauce";

		toppings.add("Shredded Mozzarella Chesse");
	}

	@Override
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}

}
