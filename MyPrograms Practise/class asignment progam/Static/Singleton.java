public class Singleton
{
	private String name;
	public static Singleton theOnlyOne = new Singleton();//public singleton
	public String getName()
  	{
  		return name;
  	}
	public void setName(String newName)
  	{
  		name = newName;
  	}
	private Singleton() //private constructor
  	{
  		name = "I AM GOD";
  	}
}