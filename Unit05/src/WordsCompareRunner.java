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
		WordsCompare one = new WordsCompare("abe", "ape");
		System.out.println(one.toString());
		
		WordsCompare two = new WordsCompare("giraffe", "gorilla");
		System.out.println(two.toString());
		
		two.setWords("one", "two");
		System.out.println(two.toString());
		
		two.setWords("fun", "funny");
		System.out.println(two.toString());
		
		two.setWords("123", "19");
		System.out.println(two.toString());
		
		two.setWords("193", "1910");
		System.out.println(two.toString());
		
		two.setWords("goofy", "godfather");
		System.out.println(two.toString());
		
		two.setWords("funnel", "fun");
		System.out.println(two.toString());
		
		out.print("Enter a word: ");
		String testOne = keyboard.next();
		
		out.print("Enter another word: ");
		String testTwo = keyboard.next();
		
		WordsCompare last = new WordsCompare(testOne, testTwo);
		System.out.println(last.toString());
		
	}
}