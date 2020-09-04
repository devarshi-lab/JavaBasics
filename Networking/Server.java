import java.lang.*;
import java.io.*;
import java.net.*;

class Server
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("Server is running...");

		ServerSocket ss=new ServerSocket(3108);

		Socket s = ss.accept();

		System.out.println("Connection Established...");

		DataOutputStream d = new DataOutputStream(s.getOutputStream());

		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

		String str1,str2;

		while((str1 = br.readLine()) != null)
		{
			System.out.println(str1);
			str2 = br1.readLine();
			d.writeBytes(str2+"\n");
		} 
		
	}
}