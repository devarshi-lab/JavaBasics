import java.lang.*;

class DisplayMsg extends Thread
{
	public String str = "";
	public int no = 0;

	public DisplayMsg(String str1,int iValue)
	{
		this.str = str1;
		this.no = iValue;
	}
	public void Display()
	{
		for(int i=1;i<=no;i++)
		{
			System.out.println(str+"\n");
		}
	}

	public void run()
	{
		try
		{
			Display();
		}
		catch(Exception e)
		{}
	}

}
class Thread2
{
	public static void main(String[] args) 
	{
		
		DisplayMsg obj1 = new DisplayMsg("Welcome",5);
		DisplayMsg obj2 = new DisplayMsg("to Thread world",5);

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		t2.start();
		
	}
}