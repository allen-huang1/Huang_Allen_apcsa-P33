//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
   public Perfect() {
	   setNumber(1);
	   isPerfect();
   }
   
   public Perfect(int n) {
	   setNumber(n);
	   isPerfect();
   }

	//add a set method
   	public void setNumber(int n) {
   		number = n;
   	}

	public boolean isPerfect()
	{
		int tot = 0;
	//calculates the sum of all the numbers less than n which are divisors of n
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				tot += i;
			}
		}
		return (tot == number);
	}

	//add a toString
	public String toString() {
		if (isPerfect()) {
			return number + " is perfect.";
		}
		return number + " is not perfect.";
	}
	
}