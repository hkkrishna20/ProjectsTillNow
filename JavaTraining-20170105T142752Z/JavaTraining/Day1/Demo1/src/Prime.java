
public class Prime {
	public void show(int n) {
		int i=1,c=0;
		for (i=1;i<=n;i++) 
		{
			if (n%i==0) 
			{
			c++;
			}
		}
			if (c==2)
			{
				System.out.println(" Prime");
			}
			else {
		
				System.out.println("The number not prime");
				
			}
	}
	 public static void main(String[] args) {
	int n=7;
	Prime obj=new Prime();
	obj.show(n);
}
}
