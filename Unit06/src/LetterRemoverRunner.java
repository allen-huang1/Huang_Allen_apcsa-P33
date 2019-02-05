//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		//add test cases		
		LetterRemover Sam = new LetterRemover("My name is Sam", 'a');
		System.out.println(Sam.toString());
		
		LetterRemover Rick = new LetterRemover("To Be Fair, You Have To Have a Very High IQ to Understand Rick and Morty", 'i');
		System.out.println(Rick.toString());
		
		Sam.setRemover("Four score and seven years ago", 'o');
		System.out.println(Sam.toString());
		
		Sam.setRemover("ssssssssxssssesssssesss", 's');
		System.out.println(Sam.toString());
		
		Sam.setRemover("qwertyqwertyqwerty", 'a');
		System.out.println(Sam.toString());
		
		Sam.setRemover("abababababa", 'b');
		System.out.println(Sam.toString());
		
		Sam.setRemover("abaababababa", 'x');
		System.out.println(Sam.toString());
	}
}