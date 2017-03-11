public class PrimeComp
{
	public static void main(String args[])
		{	
			int num[]={1,2,3,4,5,6,7,8,9,11,12,13,14,15,16,17,18,19};
			int prime[]=new int[num.length];
			int composite[]=new int[num.length];
			int count_divisor=0;
			int prime_count=0;
			int composite_count=0;
			int i,j;
		
			for(i=0;i<num.length;i++)
				{
					for(j=1;j<=num[i];j++)
					{
						if(num[i]%j==0)
						{
							count_divisor++;
						}
					}
					if(count_divisor==2)
						{	
							
							prime[prime_count]=num[i];
							prime_count++;
						}
					else
						{
							
						    composite[composite_count]=num[i];
						    composite_count++;
						}
					count_divisor=0;
				}
			System.out.print("Prime Numbers-");
			for(i=0;i<prime_count;i++)
				System.out.print(" "+prime[i]);
			System.out.println();
			System.out.print("Composite Number-");
			for(i=0;i<composite_count;i++)
				System.out.print(" "+composite[i]);
			
		}
}