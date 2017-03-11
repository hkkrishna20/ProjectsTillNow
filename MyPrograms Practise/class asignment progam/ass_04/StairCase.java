import java.io.*;
public class StairCase
{	
	public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String args[])throws IOException
		{
			int i,j,k,m,t;
			int count=2,c=1;
			int counter=0;
			int steps,stepSpace;
			System.out.print("Enter the number of steps ? ");
			steps=Integer.parseInt(br.readLine());

			stepSpace=steps;
			

			for(i=0;i<steps*2;i++)
			{	
				
				if(i%2==0)
					{ 
					c++;
					for(k=0;k<c;k++){	
							System.out.print("+");
							if(k!=c-1)
							System.out.print("---");
							}
					System.out.println();	
								
					}
				else
					{	
						
						for(j=0;j<count;j++)
							System.out.print("|   ");
							System.out.println();
						count++;
					}
				
			}
			for(i=0;i<steps;i++)	
				System.out.print("+---");
			System.out.print("+");
			
				
			}
		
}