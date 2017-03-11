class Animal
{
	protected void show()
	{
		System.out.println("Animal--");
	}
}

class Man extends Animal
{
	protected String name;
	
	Man()
	{
		name=new String();
		name="john";
	}
	
	Man(String nam)
	{
		name=new String();
		name=nam;	
	}
	protected void show()
	{
		System.out.println("Man "+name);
	}
}

class Dog extends Animal
{
	protected String name;
	
	Dog()
	{
		name=new String();
		name="tommy";
	}
	
	Dog(String nam)
	{
		name=new String();
		name=nam;	
	}
	protected void show()
	{
		System.out.println("Dog "+name);
	}
}

class Elephant extends Animal
{
	protected String name;
	
	Elephant()
	{
		name=new String();
		name="Jambo";
	}
	
	Elephant(String nam)
	{
		name=new String();
		name=nam;	
	}
	protected void show()
	{
		System.out.println("Elephant "+name);
	}
}

class Rabbit extends Animal
{
	protected String name;
	
	Rabbit()
	{
		name=new String();
		name="honey";
	}
	
	Rabbit(String nam)
	{
		name=new String();
		name=nam;	
	}
	protected void show()
	{
		System.out.println("Rabbitz "+name);
	}
}
public calss Animalroot
{
	public static void main(Strings args[])
	{
		Animal obj[]=new Animal();
		Man m=new Man();
		obj[0]=m;
		Dog d=new Dog();
		obj[1]=d;
		Elephant e=new Elephant();
		obj[2]=e;
		Rabbit r=new Rabbit();
		obj[3]=r;
	