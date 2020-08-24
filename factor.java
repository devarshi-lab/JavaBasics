import java.lang.*;
import java.util.Scanner;

class factor
{
	public int no1;
	public int ino;
	
	factor(int x)
	{
		this.no1=x;
	}
	
	void factor()
	{
		for(ino = 1;ino < no1;ino++)
		{
			if(no1 % ino == 0)
			{
				System.out.println(ino);
			}
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : \t");
		int number = sc.nextInt(); 
		factor obj = new factor(number);
		obj.factor();
	}
}

	