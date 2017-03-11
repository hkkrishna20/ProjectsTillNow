import java.io.*;

public class MaxNextMax
{
	public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String args[])throws IOException
		{
			float farr[]={2.3f,5.7f,1.6f,0.7f,2.3f};
			int i;
			
			float max=farr[0],nextmax=farr[1];
			for(i=0;i<5;i++)
			{
				if(farr[i]>max)
					max=farr[i];
				else 
					nextmax=farr[i];
			}
			System.out.println("Max="+max);
			System.out.println("NextMax="+nextmax);
			System.out.println("Average="+((max+nextmax)/2));
			
				
		}
}