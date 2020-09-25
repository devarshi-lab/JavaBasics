/*input	: str	= enter
		  index = [3,0,4,1,2]
output	: neret

explaination : 
enter = [3,0,4,1,2]
means
 e = 3,n = 0,t = 4,e = 1,r = 2.

then we have print it in manner = [0,1,2,3,4] = neret

input	: str	= hello
		  index = [4,3,1,0,2]
output	: lloeh

explaination : 
enter = [4,3,1,0,2]
means
 h = 4,e = 3,l = 1,l = 0,o = 2.
 
then we have print it in manner = [0,1,2,3,4] = lloeh

input	: str	= enter
		  index = [8,0,4,1,2]
output	: Error : invalid index
*/
import java.lang.*;
import java.util.*;

class StringDisplayIndex
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the string : \t");
		String str = sc.nextLine();

		int iLength = str.length();

		System.out.println("Enter the index : ");
		int index[] = new int[iLength];
		char arr[] = new char[iLength];

		for(int i =0;i<iLength;i++)
		{
			index[i] = sc.nextInt();
			if(index[i]>iLength || index[i]<0)
			{
				System.out.println("ERROR : INVALID INPUT");
				System.exit(0);
			}
			arr[index[i]] = (str.charAt(i));
		}

		
		System.out.print(arr);

	}
}