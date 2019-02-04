//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		System.out.println("5 is odd :: " + NumberVerify.isOdd(5));
		System.out.println("5 is even :: " + NumberVerify.isEven(5));
		
		//add in more test cases
		
		System.out.println("\n");
		System.out.println("10 is odd :: " + NumberVerify.isOdd(10));
		System.out.println("10 is even :: " + NumberVerify.isEven(10));
		
		System.out.println("\n");
		System.out.println("15 is odd :: " + NumberVerify.isOdd(15));
		System.out.println("15 is even :: " + NumberVerify.isEven(15));
		
		System.out.println("\n");
		System.out.println("10384397 is odd :: " + NumberVerify.isOdd(10384397));
		System.out.println("10384397 is even :: " + NumberVerify.isEven(10384397));
	}
}