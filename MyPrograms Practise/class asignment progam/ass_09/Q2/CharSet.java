class CharSet
{
	protected String set=new String();
	
	protected void  addAtLast(char c)
	{
		set=set+c;
	}
	
	protected void remove(char c)
	{
		int l=set.length();
		char ch[]=set.toCharArray();
		set=null;
		set=new String();
		for(int i=0;i<l;i++)
		{
			if(ch[i]!=c)
				set+=ch[i];
		}
		
	}
	public String toString()
	{
		return set;
	}
}