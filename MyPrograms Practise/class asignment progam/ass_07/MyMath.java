class MyMath
{
	static int intSqrt(int num)
	{	
		
		return (int)(Math.sqrt(num));
	}
	
	static long longAbs(long num)
	{
		if(num<0)
			return num;
		else
			return num;
	}
	
	static int intMaxThree(int a,int b,int c)
	{
		if(a>b)
		{
			if(a>c)
				return a;
			else
				return c;
		}
		else
		{
			if(b>c)
				return b;	
			else 
				return c;
		}
	}
	
}