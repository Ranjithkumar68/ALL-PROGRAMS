package org.workout;

import java.util.Scanner;

public class Wirj {
	
	private static Scanner input;

	public static void main(String[] args) {
		

	int num ;
	int num2 ;
	
	input = new Scanner(System.in);	
	
	System.out.println("Type here a number:");
	num = input.nextInt();
	
	input = new Scanner(System.in);
	System.out.println("Type Another One Number");
	num2 = input.nextInt();

	System.out.println("add = " +Math.addExact(num2, num));
	System.out.println("subtracted = " +Math.subtractExact(num,num2));
	System.out.println("mutltiply = " +Math.multiplyExact(num2, num));
	System.out.println("divided= " +Math.floorDiv(num, num2));
	System.out.println("The entered number is :" + num + "and"+num2);
	

	}
	
}
