package com.basic;

public class PerfactNumber {

		public boolean isPerfectNumber(int number){
			
			int sum = 0;
			for(int i=1;i<=number/2;i++){
				if(number%i == 0){
					sum += i;
				}
			}
			if(sum == number){
				System.out.println("It is a perfect number");
				return true;
			} else {
				System.out.println("It is not a perfect number");
				return false;
			}
		}
		
		public static  void main(String []args) {
			PerfactNumber ipn  = new PerfactNumber();
			System.out.println("Is perfect number: "+ipn.isPerfectNumber(28));
		
		}
	}


		
	
	

