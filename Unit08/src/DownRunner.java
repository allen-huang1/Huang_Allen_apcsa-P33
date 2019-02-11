//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{
		int[] nums = new int[] {1, 5, 4, 3};
		System.out.println(RayDown.go(nums));
		
		nums[0] = 6;
		System.out.println(RayDown.go(nums));
	
	}
}