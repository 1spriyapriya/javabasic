package com.basic;

import java.util.Scanner;
 class SalesMen {
public static void main(String[] args) {
	int count1=0;
	int count2=0;
	int count3=0;
	int count4=0;
	int count5=0;
	int count6=0;
	int count7=0;
	int count8=0;
	int count9=0;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the no of employee");
	int n=scan.nextInt();
	int employee[]=new int[n];
	System.out.println("Enter the salesmen ");
	for(int i=0;i<n;i++) {
		employee[i]=scan.nextInt();
	}
	for(int j=0;j<n;j++) {
		employee[j]=200+((9*employee[j])/100);
		if(employee[j]>200 && employee[j]<300)
		{
			count1++;
		}
		if(employee[j]>300 && employee[j]<400)
		{
			count2++;
		}
		if(employee[j]>400 && employee[j]<500)
		{
			count3++;
		}
		if(employee[j]>500 && employee[j]<600)
		{
			count4++;
		}
		if(employee[j]>600 && employee[j]<700)
		{
			count5++;
		}
		if(employee[j]>700 && employee[j]<800)
		{
			count6++;
		}
		if(employee[j]>800 && employee[j]<900)
		{
			count7++;
		}
		if(employee[j]>900 && employee[j]<1000)
		{
			count8++;
		}
		if(employee[j]>1000 && employee[j]<1100)
		{
			count9++;
		}
		
		
	}
	System.out.println("value between 200to299 is"+count1);
	System.out.println("value between 300to399 is"+count2);
	System.out.println("value between 400to499 is"+count3);
	System.out.println("value between 500to599 is"+count4);
	System.out.println("value between 600to699 is"+count5);
	System.out.println("value between 700to799 is"+count6);
	System.out.println("value between 800to899 is"+count7);
	System.out.println("value between 900to999 is"+count8);
	System.out.println("value between 1000to1099 is"+count9);
	
}
}
