package com.qishengvet.factory;

import java.util.ArrayList;

public class Pizza {
	String nameString;
	String doughString;
	String sauceString;
	ArrayList<String> toppings = new ArrayList<String>();

	void prepare() {
		System.out.println("Preparing " + nameString);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce..");
		System.out.println("Adding toppings: ");
		for (String string : toppings) {
			System.out.println("    " + string);
		}
	}
	
	void bake() {
		System.out.println("Bake for 25 minutes as 350");
	}
	
	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	public String getName() {
		return nameString;
	}
}
