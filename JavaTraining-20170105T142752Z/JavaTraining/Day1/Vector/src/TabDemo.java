class TabEx {
	
	synchronized void dispTab(int n) {
		int p=1;
		for (int i=1;i<5;i++) {
			p=n*i;
			System.out.println(n +"*" +i+ "=" +p);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
}

class Tab1 implements Runnable {
	TabEx t;
	Tab1(TabEx t) {
		this.t=t;
	}
	@Override
	public void run() {
	t.dispTab(12);
		
	}
}

class Tab2 implements Runnable {
	
	TabEx t;
	Tab2(TabEx t) {
		this.t=t;
	}
	@Override
	public void run() {
	t.dispTab(10);
		
	}

}

class Tab3 implements Runnable {
	
	TabEx t;
	Tab3(TabEx t) {
		this.t=t;
	}
	@Override
	public void run() {
	t.dispTab(5);
		
	}

}
public class TabDemo {
	
	public static void main(String[] args) {
		TabEx t=new TabEx();
		Tab1 obj2=new Tab1(t);
		Tab2 obj3=new Tab2(t);
		Tab3 obj4=new Tab3(t);
		
		Thread th1=new Thread(obj2);
		Thread th2=new Thread(obj3);
		Thread th3=new Thread(obj4);
		
		th1.start();
		th2.start();
		th3.start();
		
		
	}
	
	}
