//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		//add test cases	
		TriangleOne hippo = new TriangleOne("hippo");
		hippo.print();
		
		TriangleOne chicken = new TriangleOne("chicken");
		chicken.print();
		
		TriangleOne poppins = new TriangleOne("supercalifragilisticexpialidocious");
		poppins.print();
		
		TriangleOne a = new TriangleOne("a");
		a.print();
		
		TriangleOne it = new TriangleOne("it");
		it.print();
		
		TriangleOne abcd = new TriangleOne("abcd");
		abcd.print();
	}
}