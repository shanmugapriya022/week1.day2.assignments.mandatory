package week1.day2.assignments.mandatory;

public class RemoveDuplicates 
{
	/*
	 * Declaration
	 * Split the String to String Array
	 * compare the two Strings
	 */
	public static void main(String[] args) 
	{
		
		String text = " java we are learning java and exploring java basics of java";
		int count=0;
		String[] strArry=text.split(" "); 
		for (int i = 0; i < strArry.length; i++) {
	    for (int j = i+1; j < strArry.length; j++) {
	    if(strArry[i].equalsIgnoreCase(strArry[j])) { 
					count++;  
				}
			}
			if(count>0) 
			{ 
				System.out.print(" ");
				count=0; 
			}
			else
			{
				System.out.print(strArry[i]+" "); 
			}
		}
	}
}
