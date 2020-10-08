package Devarshi;

import java.lang.*;
import java.util.*;

public class MyArray
{
	public int arr[];

	public MyArray(int size)
	{
		arr = new int[size];
	}

	public void Accept()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the elements : ");

		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = input.nextInt();
		}
	}

	public void Display()
	{
		System.out.println("Entered elements are : ");
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
}
