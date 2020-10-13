import java.lang.*;
import java.util.*;
import SinglyLinkedList.SinglyLinkedList;

class LinkedList
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		SinglyLinkedList obj = new SinglyLinkedList();
		int no = 0,choice = 1;

		while(choice != 0)
		{
			System.out.println("-------------------------------------------------------");
			System.out.println("MENU");
			System.out.print("1.Insert at First Position\n2.Insert at Last Position\n3.Insert At Specific Position\n4.Delete at specific position\n5.Delete first element\n6.Delete last element\n7.Display\n8.Count\n0.exit\n");
			System.out.println("-------------------------------------------------------");
			System.out.print("\nEnter your choice : \t");
			choice = input.nextInt();
			System.out.println("-------------------------------------------------------");
			switch(choice)
			{
				case 1:
					System.out.print("Enter the element : \t");
					no = input.nextInt();
					obj.InsertFirst(no);
					break;
				case 2:
					System.out.print("Enter the element : \t");
					no = input.nextInt();
					obj.InsertLast(no);
					break;
				case 3:
					System.out.print("Enter the position : \t");
					int iPos = input.nextInt();
					System.out.print("Enter the element : \t");
					no = input.nextInt();
					obj.InsertAtPos(no,iPos);
					break;
				case 4:
					System.out.print("Enter the position : \t");
					int pos= input.nextInt();
					obj.DeleteAtPos(pos);
					break;
				case 5:
					obj.DeleteFirst();
					break;
				case 6:
					obj.DeleteLast();
					break;
				case 7:
					obj.Display();
					break;
				case 8:
					System.out.println("Number of elements is : \t"+obj.Count());
					break;
				case 0:
					break;
				default:
					System.out.println("ERROR:INVALID CHOICE!!!");
			}
		}
		
	}
}