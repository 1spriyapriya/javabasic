package com.basic;

public class Date {
	int month;
	int day;
	int year;
	public Date()
	{
		
	}
public Date(int month,int day,int year)
{
	this.month=month;
	this.day=day;
	this.year=year;
	
}
public int getMonth() {
	return month;
}
public void setMonth(int month) {
	this.month = month;
}
public int getDay() {
	return day;
}
public void setDay(int day) {
	this.day = day;
}
public void displayDate()
{
	System.out.println(month+"/"+day+"/"+year);
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}

public static void main(String []args)
{
	Date d1=new Date();
	d1.setMonth(3);
	d1.setDay(17);
	d1.setYear(1998);
	d1.displayDate();
	
	
}
	
}

