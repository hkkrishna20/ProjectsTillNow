public class Sort
{
	public static void main(String args[])
		{
			char ch[]={'a','b','c','d','e','f','g','h','i','j'};
			char temp;
			int i;
			for(i=0;i<10;i++)
				for(int j=i;j<10;j++)
					if(ch[j]>ch[i])
					{
						temp=ch[j];
						ch[j]=ch[i];
						ch[i]=temp;
					}
			System.out.println("Sorted-Array");
			for(i=0;i<10;i++)
			System.out.print(ch[i]+" ");
		}
}