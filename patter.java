import java.lang.*;
import java.util.*;

class Pattern
{
	void print(int iNumber)
	{
		int space = iNumber;
		char ch = 'A';

		for(int i = 1;i<=iNumber;i++)
		{
			for(int k=1;k<=space;k++)
			{
				System.out.print(" ");
			}
			space--;
			
			for(int j = 1;j<=i;j++)
			{
				System.out.print((ch++)+" ");
				if(ch > 'Z')
				{
					ch = 'A';
				}
			}
			ch = 'A';
			ch += i;
			
			System.out.println("");		}
	}
}
	
class patter
{
	public static void main(String arg[])
	{
		int ino = 0;
		char c = 'a';
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of rows and column : \t");
		int iRow = sc.nextInt();
		int iCol = sc.nextInt();
		
		for(int i = 1;i <= iRow;i++)
		{
			for(int j=1;j <= iCol;j++)
			{
				System.out.print(c+++"\t");
				if(c > 'z')
				{
					c = 'a';
				}
			}
			System.out.println("\n");
			
		}

		System.out.println("Enter number of for pyramid : \t");
		int iPyramid= sc.nextInt();
		
		Pattern obj = new Pattern();
		obj.print(iPyramid);
	}
}