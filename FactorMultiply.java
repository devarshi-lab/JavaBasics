/*
 Write program which accept number from user and return multiplication of all
factors of that number.
In this question you have to write the logic which should not be dependent on
other function.
Input : 7
Output : 7 (1)
Input : 9
Output : 3 (1 * 3)
Input : 12
Output : 144 (1 * 2 * 3 * 4 * 6) 
*/
import java.lang.*;
import java.io.*;

class Calculate
{
	public int no = 0;
	public int iAns = 1;

	public Calculate(int value)
	{
		this.no=value;
	}

	public int MultiplicationOfFactor()
	{
		if(no == 0)
		{
			return -1;
		}
		if(no<0)
		{
			no = -no;
		}
		for(int i = 1;i<=no/2;i++)
		{
			if(no % i == 0)
			{
				iAns *= i;
			}
		}

		return iAns;
	}

}

class FactorMultiply
{
	public static void main(String arr[]) throws IOException
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Number : \t");
		int iNumber = Integer.parseInt(input.readLine());

		Calculate obj = new Calculate(iNumber);
		int iAnswer = obj.MultiplicationOfFactor();
		if(iAnswer == -1)
		{
			System.out.println("ERROR : Number Should be greater than 0..");
		}
		else
		{
			System.out.println("Multiplication of factor is : "+iAnswer);
		}
	}
}
