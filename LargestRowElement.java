
import java.lang.*;
import java.util.*;

class Calculate
{
	
	public void RowLargeElement(int arr[][],int iRow,int iCol)
	{
		int iMax = 0;
		System.out.println("Largest elemet of each row of matrix is : ");
		for(int i = 0;i<iRow;i++)
		{
			iMax =arr[i][0];
			for(int j =0;j<iCol;j++)
			{
				if(arr[i][j]>iMax)
				{
					iMax = arr[i][j];
				}
			}
			System.out.println(iMax);
		}
	}
}

class LargestRowElement
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows : \t");
		int row = input.nextInt();
		System.out.print("Enter the number of columns : \t");
		int col = input.nextInt();

		int arr[][]=new int[row][col];

		System.out.println("Enter the "+(row*col)+" Elements : ");

		for(int i = 0;i<row;i++)
		{
			for(int j =0;j<col;j++)
			{
				arr[i][j] = input.nextInt();
			}
		}

		Calculate obj = new Calculate();
		obj.RowLargeElement(arr,row,col);
	}
}