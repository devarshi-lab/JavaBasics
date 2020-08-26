/*
 Accept range from user and return addition of perfect numbers from that range.
Input : 5 30
Output : 34 (6 + 28) 
*/

import java.lang.*;
import java.io.*;

class PerfectAddition
{
	public int iStart,iStop;

	public PerfectAddition(int iNo1,int iNo2)
	{
		this.iStart=iNo1;
		this.iStop=iNo2;
	}

	public int Addition()
	{
		if(iStop == 0 || iStop <=iStart)
		{
			return -1;
		}
		int iPrimeSum = 0;
		int iSum = 0;
		for(int i = iStart;i<=iStop;i++)
		{
			iSum = 0;
			for(int j = 1;j<i;j++)
			{
				if(i % j == 0)
				{
					iSum += j;
				}
			}
			if(iSum == i)
			{
				iPrimeSum += i;
			}
		}
		return iPrimeSum;
	}
}

class AdditionPerfectNumber
{
	public static void main(String Arr[]) throws IOException
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the range : ");
		int iStart = Integer.parseInt(input.readLine());
		int iStop = Integer.parseInt(input.readLine());

		PerfectAddition obj = new PerfectAddition(iStart,iStop);
		int iAnswer=obj.Addition();
		if(iAnswer == -1)
		{
			System.out.println("ERROR : Invalid Range!!!");
		}
		else
		{
		System.out.println("Addition of perfect number coming in range "+iStart+" to "+iStop+" is :"+iAnswer);
		}
	}
}