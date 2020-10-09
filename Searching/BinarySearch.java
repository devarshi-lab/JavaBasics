//Searching the number using binary search

import java.lang.*;
import java.util.*;
import Devarshi.MyArray;
class Searching extends MyArray
{
	public Searching(int size)
	{
		super(size);
	}

	public boolean ChkSorted()
	{
		boolean flag = true;

		for(int i=0;i<(arr.length-1);i++)
		{
			if(arr[i+1]<arr[i])
			{
				flag = false;
				break;
			}
		}

		return flag;
	}
	public boolean BinarySearch(int no)		//Binary search
	{
		int start = 0,middle = 0,end = (arr.length-1);
		boolean flag = false;

		while(start<=end)
		{
			middle = (start+end)/2;

			if((arr[middle]==no) || (arr[start]==no) || (arr[end]==no))
			{
				flag = true;
				break;
			}
			else if(arr[middle]<no)
			{
				start = middle+1;
			}
			else
			{
				end = middle-1;
			}
		}
			
		return flag;
	}
}
class BinarySearch
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number elements :  \t");
		int iNo = input.nextInt();

		Searching obj = new Searching(iNo);
		obj.Accept();

		System.out.print("Enter the element u want to search : \t");
		int no = input.nextInt();

		if(obj.ChkSorted())
		{
			if(obj.BinarySearch(no))
			{
				System.out.println("Element is in array");
			}
			else
			{
				System.out.println("Element Not Found");
			}
		}
		else
		{
			System.out.println("Error : Array is not sorted...");
		}
	}
}
