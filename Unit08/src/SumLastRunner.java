//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SumLastRunner
{
	public static void main( String args[] )
	{
		int[] test = new int[] {-99,1,2,3,4,5,6,7,8,9,10,5};
		System.out.println(RaySumLast.go(test));
		
		System.out.println(RaySumLast.go(new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, -99}));
		
		System.out.println(RaySumLast.go(new int[] {10,20,30,40,50,-11818,40,30,20,10}));
		
		System.out.println(RaySumLast.go(new int[] {32767}));
		
		System.out.println(RaySumLast.go(new int[] {255,255}));
		
		System.out.println(RaySumLast.go(new int[] {9, 10, -88, 100, -555, 2}));
		
		System.out.println(RaySumLast.go(new int[] {10, 10, 10, 11, 456}));
		
		System.out.println(RaySumLast.go(new int[] {9,8,7,6,5,4,3,2,0,-2,6}));
		
		System.out.println(RaySumLast.go(new int[] {9,10,-8,10000,-5000,-3000}));
	}
}