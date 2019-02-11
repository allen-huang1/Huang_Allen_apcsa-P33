//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter('a');
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output="";
		for (int i = amount; i > 0; i--)
		{
			//keeps track of which row we are on
			int j = i;
			char temp = letter;
			while (j > 0)
			{
				int k = amount;
				while (k >= amount - k)
				{
					output += temp;
					k--;
				}
				//changes the value of temp and decreases the number of letters the 
				// next character will be printed
				if (temp == 'Z' || temp == 'z')
				{
					temp -= 25;
				}
				else {
					temp ++;
				}
				output += " ";
				j--;
			}
			output += "\n";
			
		}
		return output;
	}
}