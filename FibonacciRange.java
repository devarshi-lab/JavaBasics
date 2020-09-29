
import java.lang.*;
import java.util.*;

class Calculate
{
	public int iNumber;

	Calculate(int value)
	{
		this.iNumber = value;
	}

	public void FibSeries()
	{
		int ret = 0;
		int ret1 = 1;
		int ret2 = 0;
		while(ret2<iNumber)
		{
			System.out.print(ret2+" ");
			ret = ret1;
			ret1 = ret2;
			ret2 = ret + ret1;
		}
	}
}

class FibonacciRange
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number : \t");
		int no = input.nextInt();

		Calculate obj = new Calculate(no);
		obj.FibSeries();
	}
}