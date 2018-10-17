/**
 * String manipulator
 * @author Tyler Yang
 * Period 7
 */
public class StringManipulator 
{
	public String noVowels(String str) 
	{
		String out = "";
		
		for(int i = 0; i < str.length(); i++) 
		{
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' ||  str.charAt(i) == 'u')
			{
				out += "*";
			}
			else
			{
				out += str.charAt(i);
			}
		}
		return out;
	}
	
	public String reverse(String str1) 
	{
		String str2 = "";
		
		for (int i = str1.length() - 1; i >= 0; i--) 
		{
			str2 +=  str1.charAt(i);
		}
		
		return str2;			
	}
}