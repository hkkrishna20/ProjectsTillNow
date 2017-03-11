public class CallGod
{
	public static final void main(String args[])
  	{
  		System.out.println(Singleton.theOnlyOne.getName());
  		Singleton.theOnlyOne.setName("I am a good God");
  		System.out.println(Singleton.theOnlyOne.getName());
  		Singleton s1= Singleton.theOnlyOne;
		System.out.println(s1.getName());
  		Singleton ss;//=new Singleton();
  	}
}