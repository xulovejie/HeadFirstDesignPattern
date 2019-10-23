package com.qishengvet.decorator;

import java.math.BigDecimal;

public class Mocha extends CondimentDecorator {

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {

		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return new BigDecimal(0.2).add(new BigDecimal(beverage.cost())).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

}
