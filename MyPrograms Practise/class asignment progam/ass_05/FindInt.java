import java.io.*;

public class FindInt
{
	public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String args[])throws IOException
		{
			int iarr[]={2,5,1,65,8,54,3,8,4,3,6,4,6,7,4,3,2,3,4,6,7,5,4};
			int i,j,rescount=0;
			int flag=0;
			int res[]=new int[iarr.length];
			int count[]=new int[iarr.length];
			for(i=0;i<iarr.length;i++)
				{	
					
					for(j=0;j<rescount;j++)
					{
						if(iarr[i]==res[j])
						{
							flag=1;
							break;
						}
					}
					if(flag==0)
					{	
						res[rescount]=iarr[i];
						for(j=i;j<iarr.length;j++)
						{
							if(iarr[j]==res[rescount])
							{
								count[rescount]++;
							
							}
						}
						rescount++;
						
				
					}
					flag=0;
				}
			for(i=0;i<rescount;i++)
			System.out.println(res[i]+" "+count[i]+" times");
			
				
		}
}