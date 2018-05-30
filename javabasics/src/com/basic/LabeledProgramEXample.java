package com.basic;

public class LabeledProgramEXample {
	public static void main(String []args)
	{
		outer:for(int j=0;j<5;j++)
		{
			inner:for(int k=0;k<3;k++)
			{
				if(k==1) {
					continue outer;
				}
				if(k==2) {
					continue inner;
				}
				System.out.println("j="+j+"k="+k);
			}
		}
	}

}
