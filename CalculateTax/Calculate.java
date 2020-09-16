package CalculateTax;
import java.lang.*;

public class Calculate
{
	public int value;

	public Calculate(int amount)
	{
		this.value = amount;
	}
	
	public int calctax()
	{
		if(value <= 500000)
		{
			return 0;
		}
		else if(value > 500000 && value <= 1000000)
		{
			value -= 500000;
			value = (value*10)/100;
			return value;
		}
		else if(value > 1000000 && value <= 2000000)
		{
			int ivalue = value - 1000000;
			ivalue = (ivalue*20)/100;
			value = 1000000;
			value -= 500000;
			value = (value*10)/100;
			return (value + ivalue);
		}
		else
		{
			int jvalue = value - 2000000;
			jvalue = (jvalue*30)/100;
			value = 2000000;
			int ivalue = value - 1000000;
			ivalue = (ivalue*20)/100;
			value = 1000000;
			value -=500000;
			value = (value*10)/100;
			return (value + ivalue + jvalue);
		}

	}
}
