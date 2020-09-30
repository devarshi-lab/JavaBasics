
import java.lang.*;
import java.util.*;

class Count
{
	
	public int CountWords(String str)
	{
		int i = 0,iCnt = 0;

		char arr[]=str.toCharArray();

		while(i<arr.length)
		{
			if(arr[i]!=' ' && i!=(arr.length-1) && (arr[i+1] ==' ' || arr[i+1] =='\t'))
			{
				iCnt++;
			}
			else if((arr[i]!=' '||arr[i]!='\t') && i==(arr.length-1))
			{
				iCnt++;
			}
			i++;
		}

		return iCnt;
	}
}

class CountWords
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the string : \t");
		String str = input.nextLine();

		Count obj = new Count();
		int ret = obj.CountWords(str);

		System.out.println("Total number of words is : "+ret);
	}
}