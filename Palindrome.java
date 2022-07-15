package week1.day2.assignments.mandatory;

public class Palindrome 
{
	/*Declaration
	 * iterate the String
	 * reverse the given string
	 * compare both reversed string and inputed string
	 */
	public static void main(String[] args) 
	{
		
		String checkPalindrome = "madam";
		String revString = "";
		char toChar;
		for (int i = checkPalindrome.length()-1; i >=0; i--) { 
			
			toChar = checkPalindrome.charAt(i); 
			revString=revString+toChar;
		}
		if(checkPalindrome.equalsIgnoreCase(revString)) 
		{
			System.out.println("Inputed String is Palindrome");
		}
		else
		{
			System.out.println("Inputed String is not Palindrome");

		}
	}

}
