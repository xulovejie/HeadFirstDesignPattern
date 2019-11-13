package com.qishengvet.singleton;

public class Singleton2 {
	// volatile 确保uniqueInstance 被初始化或Singleton2实例化时，多个线程正确的处理 uniqueInstance
	private volatile static Singleton2 uniqueInstance;
	
	private Singleton2() {}
	
	// 双重检查加锁，首先检查是否实例已经创建，如果尚未创建，才进行同步。只有第一次才会同步。
	public static Singleton2 getInstance() {
		if(uniqueInstance == null) {
			synchronized (Singleton2.class) {
				if(uniqueInstance == null) {
					uniqueInstance = new Singleton2();
				}
			}
		}
		
		return uniqueInstance;
	}
}
