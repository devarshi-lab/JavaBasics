import java.lang.*;

class FirstTenHappy
{
	public static void main(String[] args)
	{
		int iValue = 1;
		int iCnt = 1;
		int iOriginal = 0;
		int iSum = 0;
		int iDigit = 0;
		System.out.println("First 10 Happy Numbers are : ");

		while(iCnt <= 10)
		{
			iOriginal = iValue;
			while((iSum != 4) ||(iSum != 1) || (iSum != 7))
			{
				iSum = 0;
				while(iValue != 0)
				{
					iDigit = iValue % 10;
					iSum += (iDigit*iDigit);
					iValue = iValue/10;
				}
				if(iSum == 1 || iSum == 7)
				{
					System.out.println(iOriginal);
					iCnt++;
					break;
				}
				if(iSum == 4)
				{
					break;
				}
				iValue = iSum;
			}
			iValue = iOriginal+1;
		}
		
	}
}