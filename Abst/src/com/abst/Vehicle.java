package com.abst;

public abstract class Vehicle implements Travel {
	
	}
	class Car extends Vehicle{
		@Override
		public int getSpeed() {
			return 0;
		}
		
	}
	class Cycle extends Vehicle{
		@Override
		public int getSpeed() {
			return 0;
		}
		
	}

	class Bus extends Vehicle{
		@Override
		public int getSpeed() {
			return 0;
		}
		
	}