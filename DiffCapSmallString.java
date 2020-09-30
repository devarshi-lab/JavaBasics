
import java.lang.*;
import java.util.*;

class Difference
{
	
	public int DiffSmallCap(String str)
	{
		int i = 0,iDiff = 0;

		char arr[]=str.toCharArray();

		while(i<arr.length)
		{
			if(arr[i]>='A' && arr[i]<='Z')
			{
				iDiff++;
			}
			else if(arr[i]>='a' && arr[i]<='z')
			{
				iDiff--;
			}
			i++;
		}

		/*while(i<str.length())
		{
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				iDiff++;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				iDiff--;
			}
			i++;
		}*/

		if(iDiff<0)
		{
			iDiff = -iDiff;
		}

		return iDiff;
	}
}

class DiffCapSmallString
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the string : \t");
		String str = input.nextLine();

		Difference obj = new Difference();
		int ret = obj.DiffSmallCap(str);

		System.out.println("Difference between frequency of capital and small letters is : "+ret);
	}
}