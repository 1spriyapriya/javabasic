package com.basic;

public class Shape {
	//double side;
	double length;
	double breath;
	public Shape(double length,double breath) {
		if(length>0.0 && length<20.0) {
			if(breath>0.0 && breath<20.0) {
				this.length=length;
				this.breath=breath;
			}
		else {
	System.out.println("sorry length should be greaterthan 0.0 and lessthan 20.0");
		}}
	}
	public double findAreaofRectangle() {
		return length*breath;
	}
	public static void main(String []args) {
		
		Shape rectangle=new Shape(5.0,19.0);
		System.out.println(rectangle.findAreaofRectangle());
		
	
	
	}

}
