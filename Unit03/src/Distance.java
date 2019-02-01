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
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		setCoordinates(x1, y2, x2, y2);
		print();
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void calcDistance()
	{
		distance = (double)Math.sqrt((double)Math.pow((yTwo - yOne), 2) + (double)Math.pow((xTwo - xOne), 2));
	}
	
	public double getDistance()
	{
		calcDistance();
		return distance;
	}
	
	public void print()
	{
		System.out.println("The distance traveled is " + String.format("%.3f", getDistance() + "."));
	}
	
	//complete print or the toString

	public String toString()
	{
		return "";
	}
}