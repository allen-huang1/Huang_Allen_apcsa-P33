//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		//add test cases
		StringEquality myString = new StringEquality("hi", "bye");
		System.out.println(myString.toString());
		
		StringEquality testString = new StringEquality("Yes", "Yes");
		System.out.println(testString.toString());
		
		StringEquality no = new StringEquality("Yes", "No");
		System.out.println(no.toString());
		
	}
}