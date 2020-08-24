import java.lang.*;

class Hello
{
	public int fees;
	public String name;
	
	public Hello(int no,String str)
	{
		fees = no;
		name = str;
	}
		
	protected void finalize()
	{
		System.out.println("Inside Finalize");
	}
}

class method
{
	public static void main(String []arr)
	{
		Hello hobj1 = new Hello(11000,"PPA");

		System.out.println(hobj1.hashCode());

		System.gc();

	}
}
	
		
			
		