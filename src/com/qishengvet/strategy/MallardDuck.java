package com.qishengvet.strategy;

public class MallardDuck extends Duck {
	
	public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		super(flyBehavior, quackBehavior);
	}
	
	@Override
	public void dispaly() {
		System.out.println("I'm a real mallard duck");
	}

}
