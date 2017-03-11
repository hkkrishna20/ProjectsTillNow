public class ExtractDigits
	{
		public static void main(String args[])
			{
				int n=5940;
				System.out.println("n="+n);
				System.out.println("The digits of n are");
				System.out.print(n/1000);
				n%=1000;
				System.out.print(n/100);
				n%=100;
				System.out.print(n/10);
				n%=10;
				System.out.print("and"+n);
				System.out.println();
			}
}