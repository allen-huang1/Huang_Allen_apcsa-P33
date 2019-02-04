//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		//add test cases
		Perfect one = new Perfect(45);
		System.out.println(one.toString());
		
		Perfect two = new Perfect(496);
		System.out.println(two.toString());
		
		Perfect three = new Perfect(6);
		System.out.println(three.toString());
		
		Perfect four = new Perfect(14);
		System.out.println(four.toString());
	}
}