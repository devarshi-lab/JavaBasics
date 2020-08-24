/*
 Write a java program which accept one word from user through command line and
display length of that word.
 java Demo Hello
 Output : Length is 5 
 */

import java.lang.*;

class CommandLine
{
	public static void main(String arr[])
	{
		int iMax = arr[0].length();

		for(int i =0;i<arr.length;i++)
		{
			if(arr[i].length() > iMax)
			{
				iMax = arr[i].length();
			}
		}
		System.out.println("Maximum length is : "+iMax);
	}
}