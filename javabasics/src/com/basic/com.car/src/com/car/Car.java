
package com.car;

public class Car {
	private String model;
	int i=10;
	private double speed=20;
	public Car() {
		System.out.println("empty cons called");
		
	}
public Car(int speed) {
	this();
	this.speed=speed;
	System.out.println("one arg cons called");
	
}
public Car(int speed,String model)
{
	this(speed);
	this.speed=speed;
	this.model=model;
	System.out.println("two arg cons called ");
	
}
public String setModel()
{
	return model;
}
}
