import java.util.*;
import java.io.*;

class palindrome
{
	public boolean ChkPalindrome(int value)
	{
		int reverse = 0;
		int iDigit = 0;
		int original= value;
		while(value != 0)
		{
			iDigit = value % 10;
			reverse = (reverse*10) + iDigit;
			value = value/10;
		}
		
		if(original == reverse)
		{
			return true;
		}
		
		return false;
		
	}

	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number to check : \t");
		int number=Integer.parseInt(br.readLine());
		palindrome obj;
		obj = new palindrome();
		boolean check = obj.ChkPalindrome(number);
		
		if(check == true)
		{
			System.out.println("It is palindrome");
		}
		else
		{
			System.out.println("It is not palindrome");
		}
	}
}
		
		