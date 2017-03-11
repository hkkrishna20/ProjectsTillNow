public class Sum
{
	public static void main(String args[])
	{	
		double n=Integer.parseInt(args[0]);
		int s=0;
		for(int i=0;i<n;i++)
			s+=i;
		
		System.out.print("sum of"+n+" natural no."+s);
	}
	
}
		