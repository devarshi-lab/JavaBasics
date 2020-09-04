import java.lang.*;
import java.io.*;
import java.net.*;

class Client
{
	public static void main(String[] args) throws Exception 
	{
		System.out.println("Client is running...");

		Socket s = new Socket("localhost",3108);

		System.out.println("Connection is established...");

		DataOutputStream d = new DataOutputStream(s.getOutputStream());

		BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));

		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

		String str1,str2;

		while(!(str1 = br2.readLine()).equals("exit"))
		{
			d.writeBytes(str1+"\n");
			str2 = br1.readLine();
			System.out.println(str2);
		}
		
	}
}