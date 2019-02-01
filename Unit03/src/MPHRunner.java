//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MPHRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);

		out.print("Enter the distance :: ");
		int dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int mins = keyboard.nextInt();

		MilesPerHour test = new MilesPerHour(dist, hrs, mins);
		test.calcMPH();
		test.print();
		
		//add more test cases
		
		out.print("Enter another distance :: ");
		dist = keyboard.nextInt();

		out.print("Enter more hours :: ");
		hrs = keyboard.nextInt();

		out.print("Enter more minutes :: ");
		mins = keyboard.nextInt();
		
		MilesPerHour anotherTest = new MilesPerHour(dist, hrs, mins);
		anotherTest.calcMPH();
		anotherTest.print();
		
		MilesPerHour finalTest = new MilesPerHour(67, 2, 48);
		finalTest.calcMPH();
		finalTest.print();
		
	}
}