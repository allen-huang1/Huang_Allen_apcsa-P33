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