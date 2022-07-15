package week1.day2.assignments.mandatory;

public class ReverseEvenWords 
{
	public static void main(String[] args) 
	{
		/*Declaration
		 * Convert the even String to character Array
		 * reverse the even string
		 */
		String test = "java program is easy";
		String[] strArray = test.split(" ");
		int indexOfArray = 0;
				for (int i = 0; i < strArray.length; i++) {
			indexOfArray=indexOfArray+1;
			if(indexOfArray%2==0) 
			{ 
				char[] toChar=strArray[i].toCharArray();
				int arraySize=toChar.length;
				for (int j = arraySize-1; j >=0; j--) 
				{ 
					System.out.print(toChar[j]);	
				}
				System.out.print(" ");
			}
			else{
				System.out.print(strArray[i]+" ");
			}
		}
	}

}
