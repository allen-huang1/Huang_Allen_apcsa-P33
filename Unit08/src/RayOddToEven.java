//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int firstOdd = 0;
		int oddIndex = -1;
		int firstEven = 1;
		int evenIndex = -1;
		for (int i = 0; i < ray.length; i++)
		{
			if (ray[i] % 2 == 1)
			{
				oddIndex = i;
				firstOdd = ray[i];
				break;
			}
		}
		for (int i = oddIndex + 1; i < ray.length; i++)
		{
			if (ray[i] % 2 == 0)
			{
				evenIndex = i;
				firstEven = ray[i];
				break;
			}
		}
		if (evenIndex > oddIndex) 
		{
			return evenIndex - oddIndex;
		}
		else return -1;
	}
}