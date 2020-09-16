import java.lang.*;
import java.io.*;
import java.util.*;

class ArrayListProgram
{
	public static void main(String[] args)
	{
		ArrayList<Integer>al=new ArrayList<Integer>();

			//to add elements in list
			al.add(10);
			al.add(20);
			al.add(30);

			//to add element at certain position
			al.add(2,15);

			//to display the content of list
			System.out.println("Contents of ArrayList is : "+al);
			//to delete/remove element from list
			al.remove(2);
			System.out.println("Contents of ArrayList is : "+al);

			//to replace value of certain position
			al.set(2,5);
			System.out.println("Contents of ArrayList is : "+al[2]);

	
			al.clear();
		
		
	}
}