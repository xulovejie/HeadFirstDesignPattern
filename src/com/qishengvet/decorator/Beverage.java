package com.qishengvet.decorator;

public abstract class Beverage {
	public enum Size {
		TALL, 	// 小杯
		GRANDE, // 中杯
		VENTI	// 大杯
	} 
	
	protected Size size;	
	protected String descriptionString = "Unknown Beverage";
	protected double cost = 0;
	
	public String getDescription() {
		return descriptionString;
	}
	
	public abstract double cost();
	
	protected  void setSize(Size size) {
		this.size = size;
	}
	
	protected Size getSize() {
		return size;
	}
	
}
