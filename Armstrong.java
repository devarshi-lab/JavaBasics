

import java.lang.*;
import java.util.*;

class Calculate
{
	public int iNumber;

	Calculate(int value)
	{
		this.iNumber = value;
	}

	public int count(int no)
	{
		int icnt = 0;

		if(no<0)
		{
			no = -no;
		}
		while(no != 0)
		{
			icnt++;
			no = no/10;
		}

		return icnt;
	}

	public boolean ChkArmstrong()
	{
		int iSum = 0;
		int iDigit = 0;
		int temp = iNumber;
		while(iNumber != 0)
		{
			iDigit =  iNumber % 10;

			for(int i = 0;i<=power;i++)
			{
				iSum = iSum + (iDigit*iDigit*iDigit);
			}
			iNumber = iNumber / 10;

			if(iSum>temp)
			{
				break;
			}
		}

		if(iSum == temp)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class Armstrong
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number : \t");
		int no = input.nextInt();

		Calculate obj = new Calculate(no);
		boolean ret = obj.ChkArmstrong();

		if(ret == true)
		{
			System.out.println("It is Armstrong number");
		}
		else
		{
			System.out.println("It is not Armstrong number");
		}
	}
}