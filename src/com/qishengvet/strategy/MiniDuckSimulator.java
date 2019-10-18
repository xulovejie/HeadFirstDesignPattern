package com.qishengvet.strategy;

public class MiniDuckSimulator {
	/*
	 * 1 将变化和不变部分分开 ：不变部分 Duck类, 变化部分Duck子类
	 * 2 针对接口编程，而不是针对实现编程： FlyBehavior 和 QuackBehavior 接口， 他们的实现类是具体实现
	 * 3 多用组合，少用继承： 将 Fly 和  Quack 从Duck剥离出来，
	 * 
	 * 好处：应对变化，只需要新增 Duck子类  、FlyBehavior 和 QuackBehavior 实现类，其他无需改变
	 * 
     * 策略模式（strategy pattern）：
     * 定义了方法族，分别封装，让他们之间可以相互替换，此模式让算法的变化独立于使用算法的客户。
     *    
		————————————————
		一个类的行为或其算法可以在运行时更改。
		在策略模式中，我们创建表示各个策略的对象和一个行为随着策略对象而改变的context对象。
		策略对象改变context对象的执行算法

		意图：定义一系列算法，把他们一个个封装起来，并且使他们可相互替换

		主要解决：在有多种算法相似的情况下，使用if...else...所带来的复杂和难以维护

		何时使用：一个系统有许多许多类，而区分它们的只是他们直接的行为。

		如何解决：将这些算法封装成一个一个的类，任意地替换。

		关键代码：实现同一个接口。

		应用实例： 1、诸葛亮的锦囊妙计，每一个锦囊就是一个策略。 2、旅行的出游方式，选择骑自行车、坐汽车，每一种旅行方式都是一个策略。 3、JAVA AWT 中的 LayoutManager。
		————————————————
		原文链接：https://blog.csdn.net/JavaCoder_juejue/article/details/85221608

	 * 
	 */
	public static void main(String[] args) {
		Duck duck = new MallardDuck(new FlyWithWings(), new Quack());
		duck.performFly();
		duck.performQuack();
		duck.dispaly();
	}
}
