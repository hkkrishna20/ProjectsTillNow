public class ThreadDemo
{
	public static void main(String arsg[])
	{
		new NewThread();
		
		try{
			System.out.println("Main Thread:");
			for(int i=50;i>0;i--)
			{
				Thread.sleep(1);
				System.out.print("M"+i+",");
			}
		}
			catch(InterruptedException e)
			{
				System.out.println("\n Main Thread Interrupted.");
			}
	
		System.out.println("\nExiting Main Thread");
	}
}

class NewThread implements Runnable
{
	Thread t;
	NewThread()
	{
		t=new Thread(this,"Demo Thread");
		System.out.println("Child Thread:"+t);
		t.start();
	}
	
	public void run()
	{
		try{
			System.out.println("Child Thread:");
			for(int i=50;i>0;i--)
			{
				Thread.sleep(1);
				System.out.print("C"+i+",");
			}
		}catch(InterruptedException e)
			{
				System.out.println("\nExciting child thread");
			}
	}
}