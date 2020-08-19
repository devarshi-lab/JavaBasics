import java.io.*;

class jagged
{			
		
	public static void main(String arg[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the number of rows : \t");
		int row = Integer.parseInt(br.readLine());
		int col = 0;
		int arr[][] = new int[row][];
		
		for(int i = 0;i<row;i++)
		{
			System.out.println("Enter the number of columns in "+(i+1)+" row");
			col = Integer.parseInt(br.readLine());
			arr[i] = new int[col];
			for(int j =0;j<col;j++)
			{
				arr[i][j] = Integer.parseInt(br.readLine());
			}
		}
		
		System.out.println("Jagged array is : ");
		
		for(int i = 0;i<row;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println("");
		}
				
	}
}
		
			