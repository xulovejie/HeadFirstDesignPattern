package com.qishengvet.singleton;

public class Singleton1 {
	// 急切模式，在静态变量初始化中创建单件，保证了线程安全（JVM在加载类的时候创建此唯一实例）
	private static Singleton1 uniqueInstance = new Singleton1();
	
	private Singleton1() {}
	
	public static Singleton1 getInstance() {
		return uniqueInstance;
	}
}
