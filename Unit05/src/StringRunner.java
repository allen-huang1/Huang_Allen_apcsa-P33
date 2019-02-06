//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		StringOddOrEven cat = new StringOddOrEven("cat");
		System.out.println(cat.toString());
		
		cat.setString("boot");
		System.out.println(cat.toString());
		
		cat.setString("it");
		System.out.println(cat.toString());
		
		cat.setString("a");
		System.out.println(cat.toString());
		
		cat.setString("eleven");
		System.out.println(cat.toString());
		
		cat.setString("thirteen");
		System.out.println(cat.toString());
		
		cat.setString("odd");
		System.out.println(cat.toString());
		
		cat.setString("even");
		System.out.println(cat.toString());
	}
}