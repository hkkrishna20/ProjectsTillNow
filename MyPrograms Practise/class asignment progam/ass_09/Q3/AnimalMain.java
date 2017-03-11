public class AnimalMain
{
	public static void main(String args[])
	{
		Animal ani[]=new Animal[4];
		ani[0]=new Man();
		ani[1]=new Dog();
		ani[2]=new Elephant();
		ani[3]=new Rabbit();
		
		ani[0].show();
		ani[1].show();
		ani[2].show();
		ani[3].show();
	}
}