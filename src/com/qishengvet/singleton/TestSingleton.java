package com.qishengvet.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		Singleton objSingleton = Singleton.getInstance();
		objSingleton.doSomeThing();
		
		Singleton objSingleton2 = Singleton.getInstance();
		objSingleton2.doSomeThing();
		
		System.out.println(objSingleton.toString());
		System.out.println(objSingleton2.toString());

	}

}
