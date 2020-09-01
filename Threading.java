/*
Create a 4 thread to do diffrent four operations
*/
import java.io.*;
import java.lang.*;

class Addition extends Thread
{
	public int iNumber1 = 0;
	public int iNumber2 = 0;

	public Addition(int iValue1,int iValue2)
	{
		this.iNumber1 = iValue1;
		this.iNumber2 = iValue2;
	}

	public void run()
	{
		try
		{
			System.out.println("Addition is : "+(iNumber1+iNumber2));
		}
		catch(Exception e)
		{}
	}

}
class Subtraction extends Thread
{
	public int iNumber1 = 0;
	public int iNumber2 = 0;

	public Subtraction(int iValue1,int iValue2)
	{
		this.iNumber1 = iValue1;
		this.iNumber2 = iValue2;
	}

	public void run()
	{
		try
		{
			System.out.println("Subtraction is : "+(iNumber1-iNumber2));
		}
		catch(Exception e)
		{}
	}

}
class Multiplication extends Thread
{
	public int iNumber1 = 0;
	public int iNumber2 = 0;

	public Multiplication(int iValue1,int iValue2)
	{
		this.iNumber1 = iValue1;
		this.iNumber2 = iValue2;
	}

	public void run()
	{
		try
		{
			System.out.println("Multiplication is : "+(iNumber1*iNumber2));
		}
		catch(Exception e)
		{}
	}

}
class Division extends Thread
{
	public int iNumber1 = 0;
	public int iNumber2 = 0;

	public Division(int iValue1,int iValue2)
	{
		this.iNumber1 = iValue1;
		this.iNumber2 = iValue2;
	}

	public void run()
	{
		try
		{
			System.out.println("Division is : "+(iNumber1/iNumber2));
		}
		catch(Exception e)
		{}
	}

}

class Threading
{

	public static void main(String args[]) 
	{
		int iNo1 = Integer.parseInt(args[0]);
		int iNo2 = Integer.parseInt(args[1]);
		Addition obj1=new Addition(iNo1,iNo2);
		Subtraction obj2=new Subtraction(iNo1,iNo2);
		Multiplication obj3=new Multiplication(iNo1,iNo2);
		Division obj4=new Division(iNo1,iNo2);

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		Thread t3 = new Thread(obj3);
		Thread t4 = new Thread(obj4);

		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}