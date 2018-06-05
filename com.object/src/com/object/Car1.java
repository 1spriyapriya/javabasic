package com.object;

public class Car1 {

		private String model;
		int i=10;
		private double speed=20.0;
		public Car1() {
			System.out.println("empty cons called");
		
		}
public String getModel() {
			return model;
}

public void setModel(String model) {
			this.model = model;
}

public double getSpeed() {
			return speed;
		}
public void setSpeed(double speed) {
			this.speed = speed;
}
public void accelration() {
	speed+=5;
	
}
public void brake() {
		System.out.println("Car1 brake");
		
	}
public static void main(String[] args) {
Car1 car1 = new Car1();
car1.speed = 45.23;
System.out.println(car1.speed);

	}
	

	}
