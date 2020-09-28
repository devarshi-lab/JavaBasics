// Accept number from user and return its generic root.
// Input 789
// Output : 6         7+8+9    -> 24 -> 2+4    -> 6
// Input : 9948
// Output : 3         9+9+4+8    ->    30    -> 3+0    -> 3
// Input : 8
// Output : 8    -> 8
// Input :    12    
// Output:  3    -> 1 + 2 -> 3

import java.lang.*;
import java.util.*;

class Digits
{
    int GenericRoot(int iNo)
    {
    		int iSum = 0;
        	while(iNo != 0)
        	{
        		iSum = iSum + (iNo%10);
        		iNo = iNo/10;
        	}

        	if(iSum<10)
        	{
        		return iSum;
        	}
        	else
        	{
        		return GenericRoot(iSum);
        	}        	
    }
}
class GenericRoot
{
    public static void main(String arg[])
    {
        Digits dobj = new Digits();
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number");
        int value = sobj.nextInt();
        int ret = dobj.GenericRoot(value);
        System.out.println("Generic root is : "+ret);
    }
}
