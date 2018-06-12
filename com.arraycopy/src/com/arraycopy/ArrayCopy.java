package com.arraycopy;

public class ArrayCopy {
	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		long startnano=System.nanoTime();
		Runtime runtime=Runtime.getRuntime();
		runtime.addShutdownHook(new Thread(){
			@Override
			public void run() {
				System.out.println("JVM is shuttingdown");
			}
		});
		
		int pro=runtime.availableProcessors();
		System.out.println(pro);
		long ene=System.currentTimeMillis();
		long endnano=System.nanoTime();
		System.out.println(ene-start);
		System.out.println(endnano-startnano);
		System.out.println(System.getenv());
		
		
		int one[]= {2,5,6,8,9};
		int two[]=new int [one.length];
		for(int i=0;i<one.length;i++) {
			two[i]=one[i];
		}
		System.arraycopy(one,0,two, 0,one.length);
	}

}
