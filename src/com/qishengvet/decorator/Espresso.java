package com.qishengvet.decorator;

import java.math.BigDecimal;

public class Espresso extends Beverage {

	enum EspressoCost {
		TALL(0.1), GRANDE(0.2), VENTI(0.3);

		private final double value;

		private EspressoCost(double value) {
			this.value = value;
		}

		public double getValue() {
			return new BigDecimal(value).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		}

	}

	public Espresso(Size size) {

		setSize(size);

		switch (size) {
		case TALL:
			descriptionString = "Tall Espresso";
			cost = EspressoCost.TALL.getValue();
			break;

		case GRANDE:
			descriptionString = "Grande Espresso";
			cost = EspressoCost.GRANDE.getValue();
			break;
		case VENTI:
			descriptionString = "Venti Espresso";
			cost = EspressoCost.VENTI.getValue();
			break;
		}
	}

	@Override
	public double cost() {
		return cost;
	}

}
