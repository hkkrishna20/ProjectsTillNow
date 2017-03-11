class Outer
{
	public void display()
	{
		System.out.println("Outer class");
	}
	
	class Inner1
	{
		public void display()
		{
			System.out.println("Inner1 class");
		}
		
		class Inner2
		{
			public void display()
			{
				System.out.println("Inner2 class");
			}
		
			class Inner3
			{
				public void display()
				{
					System.out.println("Inner3 class");
					Inner2.this.display();
					Inner1.Inner2.this.display();
					Outer.Inner1.Inner2.this.display();
					
				}
			}
		}
	}
}