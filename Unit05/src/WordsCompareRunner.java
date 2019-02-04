//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
	    Scanner keyboard = new Scanner(System.in);
		WordsCompare one = new WordsCompare("bob", "bill");
		System.out.println(one.toString());
		
		WordsCompare two = new WordsCompare("three", "four");
		System.out.println(two.toString());
		
		out.print("Enter a word: ");
		String testOne = keyboard.next();
		
		out.print("Enter another word: ");
		String testTwo = keyboard.next();
		
		WordsCompare last = new WordsCompare(testOne, testTwo);
		System.out.println(last.toString());
		
	}
}