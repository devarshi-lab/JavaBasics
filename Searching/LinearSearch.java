//Searching the number using Linear search

import java.lang.*;
import java.util.*;
import Devarshi.MyArray;
class Searching extends MyArray
{
	public Searching(int size)
	{
		super(size);
	}

	public boolean LinearSearch(int no)
	{
		int i = 0;
		boolean flag = false;
		for(i = 0;i<arr.length;i++)
		{
			if(arr[i]==no)
			{
				flag = true;
				break;
			}
		}

		return flag;
	}

	public boolean LinearSearchBI(int no)		//linear search bidirectional
	{
		int start = 0,end = 0;
		boolean flag = false;

		for(start = 0,end = (arr.length-1);start<=end;start++,end--)
		{
			if((arr[start]==no) || (arr[end]==no))
			{
				flag = true;
				break;
			}
		}

		return flag;
	}
}
class LinearSearch
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number elements :  \t");
		int iNo = input.nextInt();

		Searching obj = new Searching(iNo);
		obj.Accept();
		obj.Display();

		System.out.print("Enter the element u want to search : \t");
		int no = input.nextInt();

		if(obj.LinearSearchBI(no))
		{
			System.out.println("Element is in array");
		}
		else
		{
			System.out.println("Element Not Found");
		}
	}
}