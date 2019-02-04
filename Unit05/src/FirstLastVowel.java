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
		if ((vowels.indexOf(a.charAt(0)) + vowels.indexOf(a.charAt(a.length()-1)) > -2)) {
			return "yes";
		/* the index is -1 if the character is not present in vowels, so the program returns "yes" if one of the characters
			returns a value greater than -2 */
		}
		return "no";
	}
}