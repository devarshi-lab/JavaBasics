/*input	: str	= enter
		  index = [3,0,4,1,2]
output	: eernt

input	: str	= hello
		  index = [4,3,1,0,2]
output	: olehl

input	: str	= enter
		  index = [8,0,4,1,2]
output	: Error : invalid index
*/
import java.lang.*;
import java.util.*;

class StringChange
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the string : \t");
		String str = sc.nextLine();

		int iLength = str.length();

		System.out.println("Enter the index : ");
		int index[] = new int[iLength];

		for(int i =0;i<iLength;i++)
		{
			index[i] = sc.nextInt();
			if(index[i]>iLength || index[i]<0)
			{
				System.out.println("ERROR : INVALID INPUT");
				System.exit(0);
			}
		}

		for(int i =0;i<iLength;i++)
		{
			System.out.print(str.charAt(index[i]));
		}

	}
}