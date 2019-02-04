//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   // define a string of vowels that we can use to check if characters are vowels without ten "if" statements
	   String vowels = "aeiouAEIOU";
		if ((vowels.contains(a.charAt(0))) {
			return "yes";
		// the index is -1 if the character is not present in 0, so the program returns "yes" if the character
			//has a nonnegative index
		}
		return "no";
	}
}