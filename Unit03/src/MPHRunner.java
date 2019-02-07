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
		MilesPerHour finalTest = new MilesPerHour(45, 0, 32);
		finalTest.calcMPH();
		finalTest.print();
		
		MilesPerHour finalTest2 = new MilesPerHour(96, 1, 43);
		finalTest2.calcMPH();
		finalTest2.print();
		
		MilesPerHour finalTest3 = new MilesPerHour(100, 2, 25);
		finalTest3.calcMPH();
		finalTest3.print();
		
		MilesPerHour finalTest4 = new MilesPerHour(50, 2, 25);
		finalTest4.calcMPH();
		finalTest4.print();
		
		
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
		
		
	}
}