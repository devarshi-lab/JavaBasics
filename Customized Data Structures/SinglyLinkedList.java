package SinglyLinkedList;
import java.lang.*;
import java.util.*;

class Node
{
	public int data;
	public Node next;

	public Node(int value)
	{
		data = value;
		next = null;
	}
}
public class SinglyLinkedList
{
	public Node Head;

	public SinglyLinkedList()
	{
		Head = null;
	}

	public void InsertFirst(int no)
	{
		Node newn = new Node(no);
		if(Head == null)
		{
			Head = newn;
		}
		else
		{
			newn.next = Head;
			Head = newn;
		}
	}

	public void InsertLast(int no)
	{
		Node newn = new Node(no);
		if(Head == null)
		{
			Head = newn;
		}
		else
		{
			Node temp = Head;

			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = newn;
		}
	}

	public void InsertAtPos(int value,int pos)
	{
		int iCnt = Count();

		if(pos<0 || pos>(iCnt+1))
		{
			return;
		}
		if(pos == 1)
		{
			InsertFirst(value);
		}
		else if(pos == iCnt+1)
		{
			InsertLast(value);
		}
		else
		{
			Node newn = new Node(value);
			Node temp = Head;

			for(int i=1;i<(pos-1);i++)
			{
				temp=temp.next;
			}
			newn.next=temp.next;
			temp.next=newn;
		}

	}

	public void DeleteAtPos(int pos)
	{
		int iCnt = Count();

		if(pos<0 || pos>iCnt)
		{
			return;
		}
		if(pos == 1)
		{
			DeleteFirst();
		}
		else if(pos == iCnt)
		{
			DeleteLast();
		}
		else
		{
			Node temp = Head;

			for(int i=1;i<(pos-1);i++)
			{
				temp=temp.next;
			}
			temp.next=temp.next.next;
		}

	}

	public void DeleteFirst()
	{
		if(Head == null)
		{
			return;
		}
		else
		{
			Head = Head.next;
		}
	}

	public void DeleteLast()
	{
		if(Head == null)
		{
			return;
		}
		else
		{
			if(Head.next == null)
			{
				Head = null;
				return;
			}
			Node temp = Head;
			while(temp.next.next != null)
			{
				temp = temp.next;
			}
			temp.next = null;
		}
	}

	public void Display()
	{
		Node temp = Head;

		System.out.println("Total elements are : ");
		while(temp!=null)
		{
			System.out.print("|"+temp.data+"|->");
			temp = temp.next;
		}
		System.out.print("null");
		System.out.println();
	}

	public int Count()
	{
		Node temp = Head;
		int iCnt = 0;

		while(temp!=null)
		{
			iCnt++;
			temp = temp.next;
		}
		
		return iCnt;
	}
}