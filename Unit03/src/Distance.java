//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		setCoordinates(0, 0, 0, 0);
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		setCoordinates(x1, y1, x2, y2);
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		// changes global variables based on input integers
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void calcDistance()
	{
		// calculates the distance between two coordinate points as a double
		distance = Math.sqrt(Math.pow(((double)yTwo - (double)yOne), 2) + Math.pow(((double)xTwo - (double)xOne), 2));
	}
	
	public double getDistance()
	{
		// calculates and outputs the distance between two coordinate points
		calcDistance();
		return distance;
	}
	
	public void print()
	{
		//prints the total distance traveled
		System.out.println("The distance traveled is " + String.format("%.3f", getDistance()) + ".");
	}
	
	//complete print or the toString

	public String toString()
	{
		return "";
	}
}