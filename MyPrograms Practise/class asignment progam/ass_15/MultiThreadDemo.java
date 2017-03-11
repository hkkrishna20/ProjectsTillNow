public class MultiThreadDemo
{
	public static void main(String []s)
	{
		new NewThread("One");
		new NewThread("Two");
		new NewThread("Three");
	
	try{
		Thread.sleep(1000);
		}catch(InterruptedException e)
			{
				System.out.println("Main Thread Interrrupted...");
			}
	
	
		System.out.println("\nMain Thread exciting");
	}
}


class NewThread implements Runnable
{
	String name;
	Thread t;
	
	NewThread(String threadname)
	{
		name=threadname;
		t=new Thread(this,name);
		System.out.println("New thread:"+t);
		t.start();
	}
	
	public void run()
	{
		for(int i=50;i>0;i--)
		{
			System.out.println("["+name+":"+i+"]");
		}
		System.out.println("\n"+name+"exciting.");
	}
}