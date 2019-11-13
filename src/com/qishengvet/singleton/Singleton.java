package com.qishengvet.singleton;
//单间模式 确保一个类只有一个实例，并提供一个全局访问
// 把某个类设计成自己管理的一个单独实例，同时也避免其他类再自行产生实例，想要取得单间实例，通过单件类是唯一的途径
// 提供这个实例的全局访问点，需要实例时，向类查询，它会返回单个实例。
// 利用延时实例化的方式创建单间，对资源敏感的对象特别重要
public class Singleton {
	// 静态变量记录Singleton的唯一实例
	private static Singleton uniqueInstanceSingleton;
	
	// 私有构造方法，只有Singleton内才可以调用构造器
	private Singleton() {}
	
	// 实例化对象，并返回这个实例
	// synchronized 迫使每个线程在进入这个方法之前，要先等别的线程离开该方法
	//也就是说，不会有两个线程可以同时进入这个方法
	// 1 性能对应用程序不是很关键，就什么都别做（简单 高效， 执行效率下降）
	public static synchronized Singleton getInstance() {
		if(uniqueInstanceSingleton == null) {
			uniqueInstanceSingleton = new Singleton();
		}
		
		return uniqueInstanceSingleton;
	}
	
	public void doSomeThing() {
		System.out.println("hi");
	}
}
