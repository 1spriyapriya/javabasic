package com.object;

public class ThreeDimensionalShape extends Shape{
	float radius;
	double area;
	public void sphere(int radius) {
		area=3.14*radius*radius;
		System.out.println("sphere:"+area);
	}
	public void cube(int length) {
		area=length*length*length; 
		System.out.println("cube:"+area);
	}
	public static void main(String[] args) {
		ThreeDimensionalShape threeshape=new ThreeDimensionalShape();
		threeshape.display();
		threeshape.sphere(19);
		threeshape.cube(4);
	}

}
