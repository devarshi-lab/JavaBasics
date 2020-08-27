import java.lang.*;
import java.util.*;

class Demo extends Thread
{
	public void run() 
	{
		try
		{
			Thread.sleep(1000);
			for(int i = 0; i<= 10;i++)
			{
				System.out.println("Thread Name : "+Thread.currentThread().getName()+"Thread Id :"+Thread.currentThread().getId()+"Number :"+i);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException obj)
		{
			System.out.println("Inside");
		}

	}
}

class ThreadTest
{
	public static void main(String arr[]) throws InterruptedException
	{
		System.out.println("Inside main");
		System.out.println("Main Thread name : "+Thread.currentThread().getName()+"Main thread id : "+Thread.currentThread().getId());

		Demo obj1 = new Demo();
		Thread t1 = new Thread(obj1);

		Demo obj2 = new Demo();
		Thread t2 = new Thread(obj2);

		Demo obj3 =new Demo();
		Thread t3 = new Thread(obj3);

		t1.start();
		t2.start();
		t3.start();
		
	}
}