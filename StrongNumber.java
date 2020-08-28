import java.lang.*;
import java.util.*;

class Check
{
	public int iNo = 0;
	public int iOriginal = 0;
	public int iSum = 0;
	public int iFactSum = 1;


	public Check(int x)
	{
		this.iNo = x;
		this.iOriginal = x;
	}

	boolean ChkStrong()
	{
		while(iNo != 0)
		{
			int iDigit = iNo % 10;
			iFactSum = 1;

			while(iDigit > 0)
			{
				iFactSum *= iDigit;
				iDigit--; 
			}
			iSum += iFactSum;
			iNo = iNo/10;
		}

		if(iOriginal == iSum)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class StrongNumber
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int iNumber = input.nextInt();

		Check obj = new Check(iNumber);
		boolean iAnswer = obj.ChkStrong();

		if(iAnswer == true)
		{
			System.out.println("It is strong Number...");
		}
		else
		{
			System.out.println("It is not strong Number...");
		}
		
	}
}