//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		//add test cases
		Word hello = new Word("Hello");
		System.out.println(hello.toString());
		
		Word world = new Word("World");
		System.out.println(world.toString());
		
		Word jukebox = new Word("JukeBox");
		System.out.println(jukebox.toString());
	}
}