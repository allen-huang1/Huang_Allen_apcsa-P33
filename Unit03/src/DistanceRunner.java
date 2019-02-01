//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		
		Scanner keyboard = new Scanner(in);
		
		Distance myDistance = new Distance(1, 2, 3, 5);
		myDistance.print();
		
		out.print("Enter the first x-coordinate: ");
		int x1 = keyboard.nextInt();
		
		out.print("Enter the first y-coordinate: ");
		int y1 = keyboard.nextInt();
		
		out.print("Enter the second x-coordinate: ");
		int x2 = keyboard.nextInt();
		
		out.print("Enter the second y-coordinate: ");
		int y2 = keyboard.nextInt();
		
		Distance anotherDistance = new Distance(x1, y1, x2, y2);
		anotherDistance.print();
		
		Distance finalDistance = new Distance(5462, 4803, 5497, 4320);
		finalDistance.print();
	}
}