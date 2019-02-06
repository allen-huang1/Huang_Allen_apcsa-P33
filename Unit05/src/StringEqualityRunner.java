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
		StringEquality myString = new StringEquality("hello", "goodbye");
		System.out.println(myString.toString());
		
		StringEquality testString = new StringEquality("one", "two");
		System.out.println(testString.toString());
		
		StringEquality no = new StringEquality("three", "four");
		System.out.println(no.toString());
		
		no.setWords("TCEA", "UIL");
		System.out.println(no.toString());
		
		no.setWords("State", "Champions");
		System.out.println(no.toString());

		no.setWords("ABC", "ABC");
		System.out.println(no.toString());
		
		no.setWords("ABC", "CBA");
		System.out.println(no.toString());
		
		no.setWords("Same", "Same");
		System.out.println(no.toString());
	}
}