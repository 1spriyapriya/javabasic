package com.object;

public class Taxi1 extends Car1{
	public Taxi1() {
		super();
		System.out.println("Taxi cons empty");
	}
	public Taxi1(int i) {
		//super(i);
	
		System.out.println("Taxi cons one arg");
	
		}
	@Override
	public void brake() {
		System.out.println("Taxi brake");
	}
	public static void main(String []args) {
		Taxi1 taxi1=new Taxi1();
		taxi1.brake();
		//object substitution
		Car1 car1=new Taxi1();
		car1.brake();
	}
		
			
		
			
		}
		
		
			
		
	


