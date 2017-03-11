class CharSortedSet extends CharSet
{
	protected void addAtLast(char c)
	{	

		super.addAtLast(c);
		sort();	
		
	}
	protected void remove(char c)
	{	
		super.remove(c);
	}
	public String toString()
	{	

		return super.toString();
	}
	private void sort()
	{	
		char arr[]=set.toCharArray();
		int l=set.length();
		//System.out.print(l);
		char temp;
		for(int i=0;i<l;i++)
		{
			for(int j=i;j<l;j++)
			{
				if((int)arr[i]>(int)arr[j])
					{
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
			}
		}
		set=null;
		set=new String();
		for(int i=0;i<l;i++)
			set=set+arr[i];
	}
	
}