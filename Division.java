package com.codegnan.javaapp05022026.mathematics;
//import com.codegnan.javaapp05022026.mathematics.Greeting;

public class Division {
	Greeting greeting = new Greeting();
	//Greeting greeting;
	
	public int divide(int[] numbers) {
		int result = 0;
		
		System.out.println("Divide started.");
		
		System.out.println("1st number is: " + numbers[0]);
		System.out.println("2nd number is: " + numbers[1]);

		try {
			result = numbers[0] / numbers[1];
			
			try {
				greeting.hi();
			} catch (NullPointerException nullPointerException) {
				nullPointerException.printStackTrace();
			}
			
			System.out.println("1st number / 2nd number is " + result);
					System.out.println();

			
		} catch(ArithmeticException arithmeticException) {
			arithmeticException.printStackTrace();
		} catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
			arrayIndexOutOfBoundsException.printStackTrace();
		}
		
		/* try {
		greeting.hi();
		greeting.hello();
		} catch(NullPointerException nullPointerException) {
			nullPointerException.printStackTrace();
		} */			
		
		
		try {
			System.out.println("3rd number is: " + numbers[2]);
			System.out.println("4th number is: " + numbers[3]);
			
			result = numbers[2] / numbers[3];
			
			try {
				greeting.hello();
			} catch (NullPointerException nullPointerException) {
				nullPointerException.printStackTrace();
			}
			
			System.out.println("3rd number / 4th number is " + result);
			
		} catch(ArithmeticException arithmeticException) {
			arithmeticException.printStackTrace();
		} catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
			arrayIndexOutOfBoundsException.printStackTrace();
		}
		
		
		System.out.println("Divide ended.");
		
		return result;
	}
}