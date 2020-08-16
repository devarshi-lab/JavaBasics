import java.util.*;

class LargeNumber
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements : \t");
		int no = sc.nextInt();
		int arr[] = new int[no];
		
		
		for(int i =0;i<no;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int large = arr[0];
		
		for(int i =0;i<no;i++)
		{
			if(arr[i] > large)
			{
				large = arr[i];
			}
		}
		System.out.println("Largest number in array is : \t"+large);
	}
}