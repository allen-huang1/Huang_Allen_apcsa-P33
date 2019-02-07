/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		int pos = sample.indexOf("slow");
		if(pos != -1) {
			System.out.println("slow is found at position " + pos);
		}
		else {
			System.out.println("slow is not found");
		}
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		//  Try other methods here:
		int count = 0;
		sample = "Computer Science is the best, the greatest, and the most wonderful subject to study!";
		for (int i = 0; i < sample.length() - 2; i++)
		{
			if (sample.substring(i, i+3).equals("the"))
			{
				count++;
			}
		}
		System.out.println("The string has " + count + " occurrences of 'the'.");

	}

}
