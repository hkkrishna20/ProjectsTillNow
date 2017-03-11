import java.io.*;

public class MinMax
{
	public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String args[])throws IOException
		{
			float farr[]={2.3f,5.7f,1.6f,0.7f,2.3f};
			int i;
			
			float min=farr[0],max=farr[1];
			for(i=0;i<5;i++)
			{
				if(farr[i]>max)
					max=farr[i];
				else if(farr[i]<min)
					min=farr[i];
			}
			System.out.println("Max="+max);
			System.out.println("Min="+min);
			
				
		}
}