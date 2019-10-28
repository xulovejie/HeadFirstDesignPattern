package com.qishengvet.decorator;

import java.math.BigDecimal;

public class Whip extends CondimentDecorator {

	enum WhipCost {
		TALL(0.1), GRANDE(0.2), VENTI(0.3);

		private final double value;

		private WhipCost(double value) {
			this.value = value;
		}

		public double getValue() {
			return new BigDecimal(value).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		}

	}

	public Whip(Beverage beverage) {
		this.beverage = beverage;
		// 将beverage的size 传递给本对象
		setSize(this.beverage.getSize());

		switch (size) {
		case TALL:
			descriptionString = "Tall Whip";
			cost = WhipCost.TALL.getValue();
			break;

		case GRANDE:
			descriptionString = "Grande Whip";
			cost = WhipCost.GRANDE.getValue();
			break;
		case VENTI:
			descriptionString = "Venti Whip";
			cost = WhipCost.VENTI.getValue();
			break;
		}
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " " + descriptionString;
	}

	@Override
	public double cost() {

		return new BigDecimal(cost).add(new BigDecimal(beverage.cost())).setScale(2, BigDecimal.ROUND_HALF_UP)
				.doubleValue();
	}

}
