package com.qishengvet.strategy;

public abstract class Duck {
	// 根据超类型编程
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	// 动态绑定方法族
	public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		this.flyBehavior = flyBehavior;
		this.quackBehavior = quackBehavior;
	}
	
	public abstract void dispaly();
	
	//委托给行为类
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys");
	}
}
