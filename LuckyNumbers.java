
import java.lang.*;
import java.util.*;

class Calculate
{
	public void ChkLucky(int arr[],int iNumber)
	{
		System.out.println();

		for(int  i = 1;i<iNumber-1;i++)
		{
			if(arr[i] == (arr[i-1]+arr[i+1]))
			{
				System.out.print(arr[i]+"\t");
			}
		}
	}
}

class LuckyNumbers
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number : \t");
		int no = input.nextInt();

		int arr[] = new int[no];

		for(int i = 0;i<no;i++)
		{
			arr[i] = input.nextInt();
		}

		Calculate obj = new Calculate();
		obj.ChkLucky(arr,no);
	}
}