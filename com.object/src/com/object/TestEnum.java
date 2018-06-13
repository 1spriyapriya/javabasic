package com.object;
public class TestEnum {
	
	
		
			public static void main(String[] args) {
				Level level=Level.HIGH;
				System.out.println(level.getClass().getName());
				System.out.println(level.name());
				System.out.println(level.ordinal());
				System.out.println(level.levelCode);
				System.out.println(level.getlevelcode());
				Level levelone[]=Level.values();
				for(int i=0;i<levelone.length;i++) {
					System.out.println(levelone.length);
					
				}
			}

		}



