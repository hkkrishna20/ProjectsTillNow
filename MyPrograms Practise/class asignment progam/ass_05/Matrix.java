import java.io.*;

public class Matrix
{
	public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String args[])throws IOException
	{
		int r,c;
		boolean t=true;
		int choice;
		int arr1[][],arr2[][];
	while(t)
		{
			System.out.println("Enter Dimension for matrix--");	
			System.out.print("row ? ");
			r=Integer.parseInt(br.readLine());
		
			System.out.print("column ? ");
			c=Integer.parseInt(br.readLine());
			
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Transpose");
			System.out.println("5.Diagonal Sum");
			
			System.out.println("Enter your choice<1/2/3/4> ? ");
			choice=Integer.parseInt(br.readLine());

			switch(choice)
			{
				case 1:addition();break;
				default:System.out.println("Invalid Choice");
			}
		System.exit(0);
		
		}
	}
	
	
	static void addition()
	{	
		insertElement();
		for(int i=0;i<r;i++)
			for(int j=0;i<c;i++)
				System.out.print(arr1[i][j]+arr2[i][j])
	}
	
	static void insertElement()
	{
		System.out.print("Enter array1 element--");
		for(int i=0;i<r;i++)
			for(int j=0;i<c;i++)
				{
					System.out.print("arr["+i+"]["+j+"] ? ";
					arr1[i][j]=Integer.parseInt(br.readLine());
				}
	}
	
}