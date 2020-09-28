import java.lang.*;
import java.util.*;

class Check
{
	public int iValue1 = 0,iValue2 = 0;
	public int iSum = 0;
	public int iFact[] = {1,1,2,6,24,120,720,5040,40320,362880};


	public Check(int iBeg,int iEnd)
	{
		this.iValue1 = iBeg;
		this.iValue2 = iEnd;
	}


	void ChkStrong()
	{
		if(iValue2<=iValue1 || iValue2<=0 || iValue1 < 0)
		{
			System.out.println("Error : Invalid Range");
			return;
		}
		for(int i = iValue1;i<=iValue2;i++)
		{
			int itemp = i;
			iSum = 0;
			while(itemp != 0)
			{
				int iDigit = itemp % 10;
				iSum = iSum + iFact[iDigit];
				itemp = itemp/10;
			}

			if(i == iSum)
			{
				System.out.println(i);
			}
		}
	}
}

class StrongNumberRange
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Starting : ");
		int iStart = input.nextInt();

		System.out.println("Enter the Ending : ");
		int iEnd = input.nextInt();

		Check obj = new Check(iStart,iEnd);
		obj.ChkStrong();
	}
}