package com.qishengvet.decorator;

import com.qishengvet.decorator.Beverage.Size;

public class StarbuzzCoffee {
	public static void main(String[] args) {
		Beverage beverage = new Espresso(Size.GRANDE);
		System.out.println(beverage.getDescription() + " $" + beverage.cost());

		beverage = new Whip(beverage);
		beverage = new Whip(beverage);
		beverage = new Mocha(beverage);
		beverage = new Mocha(beverage);
		

		System.out.println(beverage.getDescription() + " $" + beverage.cost());

	}
}
