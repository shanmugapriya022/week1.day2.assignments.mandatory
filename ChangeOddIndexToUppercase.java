package week1.day2.assignments.mandatory;


public class ChangeOddIndexToUppercase 
{

	/*Declaration
	 * Convert String to character array
	 * iterating through Array list
	 * find the odd index
	 * print the even character
	 * change the character to upper case and then print
	 */

public static void main(String[] args) 
	{

		 
		String test = "priya";
		int lengthOfString=0;
		char[] toChar = test.toCharArray(); 
		System.out.print("Result Here :  ");
		for (int i = 0; i < toChar.length; i++) 
		{ 
			lengthOfString=i+1;
			if(lengthOfString%2==0) 
			{  
				System.out.print(toChar[i]); 
			}
			else
			{
				System.out.print(Character.toUpperCase(toChar[i]));  
			}	
		}
	}
}
