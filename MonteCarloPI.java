package org.javaturk.algorithm;

import java.util.Scanner;

public class MonteCarloPI {

	public static void main(String[] args) {
		
		System.out.println("Nokta sayısını girin : ");
		Scanner k = new Scanner(System.in);
		int n = k.nextInt();
		
		int numberInCircle = 0;
		
		long start = System.currentTimeMillis();
		
		for(int i = 0;i<n;i++) {
			double x = Math.random();
			double y = Math.random();
			double distance = x*x +y*y;
			
			if(distance <= 1) {
				numberInCircle++;
			}
			
		}
		long end = System.currentTimeMillis();
		long time = (end-start);
		double myPI = 4.0 *  numberInCircle / n;
		System.out.println("Java's PI: "+Math.PI);
		System.out.println("My PI: "+myPI);
		System.out.println("Time: "+time+" ms.");
		
	}

}
