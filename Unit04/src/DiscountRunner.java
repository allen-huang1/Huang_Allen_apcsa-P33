//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("For an original bill of 1500, the total amount paid is " + Discount.getDiscountedBill(1500));
		System.out.println("For an original bill of 2500, the total amount paid is " + Discount.getDiscountedBill(2500));
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		
		System.out.println("Your total bill is " + Discount.getDiscountedBill(amt));
		
		out.print("Enter a new bill amount :: ");
		double new_amt = keyboard.nextDouble();
		
		System.out.println("Your new total bill is " + Discount.getDiscountedBill(new_amt));
	}
}