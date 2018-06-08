package com.object;

import java.util.Scanner;

public class DoubleTest {
public static void main(String[] args) {
	String s1;
	String s2;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the first number");
	s1=input.next();
	System.out.println("Enter the second number");
	s2=input.next();
	double total=0.0;
	total+=Double.parseDouble(s1)+Double.parseDouble(s2);
	System.out.printf("The sum should apper here:%.2f\n",total);
}
}
