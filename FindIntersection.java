package week1.day2.assignments.mandatory;

public class FindIntersection 
{
	/*
	 * Declaration of integer array
	 * iterating both integer arrays
	 * find common values in firstArray and secndArray
	 * find common values in firstArray and secndArray
	 */
	public static void main(String[] args) 
	{
		
		int[] firstArray = {3,2,11,4,6,7};
		int[] secndArray = {1,2,8,4,9,7};
		for (int i = 0; i < firstArray.length; i++) 
		{
			for (int j = 0; j < secndArray.length; j++) 
			{
				if(firstArray[i]==secndArray[j])   
				{
					System.out.print(firstArray[i]+" "); 
				}
			}
		}
	}
}
