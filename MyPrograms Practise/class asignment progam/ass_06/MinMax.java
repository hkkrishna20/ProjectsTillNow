

public class MinMax
{
	
	public static void main(String args[])
		{
			int l=args.length;
			double farr[]=new double[l];
			for(int i=0;i<l;i++)
				farr[i]=Double.parseDouble(args[i]);
			
			
			double min=farr[0],max=farr[1];
			for(int i=0;i<5;i++)
			{
				if(farr[i]>max)
					max=farr[i];
				else if(farr[i]<min)
					min=farr[i];
			}
			System.out.println("Max="+max);
			System.out.println("Min="+min);
			System.out.println("Mean="+(max+min)/2);
			
				
		}
}