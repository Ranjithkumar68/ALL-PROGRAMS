package org.workout;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			System.out.printf("1");
			int data = 5 / 0;
		} catch (ArithmeticException e) {
			Throwable obj = new Throwable("Sample");
			
	}}}


// QUESTION 5:
// ------------
// Description : Find the output for the program:
//
// import java.io.EOFException;
// import java.io.IOException;
//
// public class Test
// {
// public static void main(String[] args)
// {
// try
// {
// System.out.printf("1");
// int value = 10 / 0;
// throw new IOException();
// }
// catch(EOFException e)
// {
// System.out.printf("2");
// }
// catch(ArithmeticException e)
// {
// System.out.printf("3");
// }
// catch(NullPointerException e)
// {
// System.out.printf("4");
// }
// catch(IOException e)
// {
// System.out.printf("5");
// }
// catch(Exception e)
// {
// System.out.printf("6");
// }
// }
// }
