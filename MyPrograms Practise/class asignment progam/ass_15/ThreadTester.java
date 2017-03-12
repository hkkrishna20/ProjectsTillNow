class PrintThread extends Thread
{
	private int sleepTime;
	
	public PrintThread(String name)
	{
		super(name);
		sleepTime=(int)(Math.random()*5000);
		System.err.println("Name:"+getName()+":sleep:"+sleepTime);
	}
	
	public void run()
	{
		try
		{
			System.err.println(getName()+" going to sleep");
			Thread.sleep(sleepTime);
		}
			catch(InterruptedException exception)
			{
				System.err.println(exception.toString());
			}
	
	System.err.println(getName()+" done sleeping");
	}
}

public class ThreadTester
{
	public static void main(String args[])
	{
		PrintThread thread1,thread2,thread3,thread4;
		thread1=new PrintThread("thread1");
		thread2=new PrintThread("thread2");
		thread3=new PrintThread("thread3");
		thread4=new PrintThread("thread4");
		
		System.err.println("Starting Thread.......");
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
	}
 }