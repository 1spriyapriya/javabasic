package com.logic;

public class WorldWideWeb {
	public static int getLetterNo(char letter){
		return (int)letter-64;
		}

		public static int diffLetter(int a, int b){
		int difference=a-b;
		if(difference<0)
		    difference*=-1;
		return difference;
		}

		public static void main(String[] args){
		String input1="WORLD WIDE WEB";
		char ch1,ch2;
		int c;
		int d;
		int num1,num2;
		int sum=0;
		int output=0;
		String[] words=input1.toUpperCase().split("\\s");
		String totall="";

		for(String w:words){
		    c=0;
		    d=w.length()/2;
		    sum=0;
		    while(c<d){
		        ch1=w.charAt(c);
		        ch2=w.charAt(w.length()-c-1);
		        c++;
		        num1=getLetterNo(ch1);
		        num2=getLetterNo(ch2);
		        sum+=diffLetter(num1,num2);
		    }
		    if(w.length()%2!=0)
		        sum+=getLetterNo(w.charAt(d));
		    totall+=sum;
		}
		output=Integer.valueOf(totall);


		System.out.println(output);    
		}

		}
