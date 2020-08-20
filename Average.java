import java.io.*;

class Average
{
	public double average(int number) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[number];
		double avg = 0.0;
		
		for(int i = 0;i<number;i++)
		{
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 0;i<number;i++)
		{
			avg += arr[i]; 
		}
		
		avg = (avg/number);
		
		return avg;
	}
			
		
	public static void main(String arg[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the number of elements : \t");
		int no = Integer.parseInt(br.readLine());
		
		Average obj = new Average();
		double ans = obj.average(no);
		
		System.out.println("Average of numbers is : \t"+ans);
	}
}
		
			