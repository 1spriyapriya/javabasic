package com.object;

public class TwoDimensionalShape extends Shape{
	int width,area;
	public void square(int length) {
		
		area=length*length;
		System.out.println("square:"+area);
	}
	public void rectangle(int length,int width) {
		area=length*width;
		System.out.println("rectangle:"+area);
	}
public static void main(String[] args) {
	TwoDimensionalShape twoshape=new TwoDimensionalShape();
	twoshape .display();
	twoshape.square(16);
	twoshape.rectangle(4,5);
	
}
}
