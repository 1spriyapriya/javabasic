package com.object;
import java.util.Scanner;
public class WifiPassword {


	public static int unitsPlaceValue=0;
	public static char tensPlaceValue;
	public static char hundredsPlaceValue;
	public static int thousandsPlaceValue;
	public static String WifiPassword;
	public void unitsPlace(int num)
	{
	unitsPlaceValue=(num%100)/10;
	}
	public void tensPlace(String name){
	int a=name.length();
	tensPlaceValue=name.charAt(a-1);
	}
	public void hundredsPlace(int num1){
	int a=num1%10;
	switch(a){
	case 1:
	hundredsPlaceValue='!';
	break;
	case 2:
	hundredsPlaceValue='@';
	break;
	case 3:
	hundredsPlaceValue='#';
	break;
	case 4:
	hundredsPlaceValue='$';
	break;
	case 5:
	hundredsPlaceValue='%';
	break;
	case 6:
	hundredsPlaceValue='^';
	break;
	case 7:
	hundredsPlaceValue='&';
	break;
	case 8:
	hundredsPlaceValue='*';
	break;
	case 9:
	hundredsPlaceValue='(';
	break;
	case 10:
	hundredsPlaceValue=')';
	break;
	}
	}
	public void thousandsPlace(int num2){
	int i,sum=0;
	while(num2>0)
	{
	i=num2%10;
	sum+=i;
	num2=num2/10;
	}
	if(sum>=0){
	i=sum%10;
	thousandsPlaceValue+=i;
	sum=sum/10;

	}
	else{
	thousandsPlaceValue=sum;
	}
	}
	public void concatenate(){
	WifiPassword=unitsPlaceValue+""+tensPlaceValue+""+hundredsPlaceValue+""+thousandsPlaceValue;
	System.out.println(WifiPassword);
	}
	public static void main(String []args){
	int roomNum;
	String myName;
	WifiPassword one=new WifiPassword();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the roomNum");
	roomNum=sc.nextInt();
	System.out.println("Enter your name");
	myName=sc.next();
	one.unitsPlace(roomNum);
	one.tensPlace( myName);
	one.hundredsPlace(roomNum);
	one.thousandsPlace( roomNum);
	one.concatenate();

	}
	}


