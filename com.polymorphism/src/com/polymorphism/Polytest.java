package com.polymorphism;

public class Polytest  {
public static void main(String[] args) {
	Polytest pt=new Polytest();
	Sportscar sc=new Sportscar();
	Policecar pc=new Policecar();
	Taxi1 t=new Taxi1();
	pt.brake(sc);
	pt.brake(pc);
	pt.brake(t);
}
public void brake(Car1 car1) {
	car1.brake();
}
}
