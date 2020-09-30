
import java.lang.*;
import java.util.*;

class Calculate
{
	
	public void RowAddition(int arr[][],int iRow,int iCol)
	{
		int iSum = 0;
		System.out.println("Addition of each row of matrix is : ");
		for(int i = 0;i<iRow;i++)
		{
			iSum = 0;
			for(int j =0;j<iCol;j++)
			{
				iSum += arr[i][j];
			}
			System.out.println(iSum);
		}
	}
}

class MatrixRowAddition
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows : \t");
		int row = input.nextInt();
		System.out.print("Enter the number of columns : \t");
		int col = input.nextInt();

		int arr[][]=new int[row][col];

		System.out.println("Enter the"+(row*col)+"Elements : ");

		for(int i = 0;i<row;i++)
		{
			for(int j =0;j<col;j++)
			{
				arr[i][j] = input.nextInt();
			}
		}

		Calculate obj = new Calculate();
		obj.RowAddition(arr,row,col);
	}
}