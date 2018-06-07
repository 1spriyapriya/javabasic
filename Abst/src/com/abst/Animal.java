package com.abst;

public abstract class Animal implements Travel {

}
class Cat extends Vehicle{
	@Override
	public int getSpeed() {
		return 0;
	}
	
}
class Rabbit extends Vehicle{
	@Override
	public int getSpeed() {
		return 0;
	}
	
}

class Dog extends Vehicle{
	@Override
	public int getSpeed() {
		return 0;
	}
	
}
