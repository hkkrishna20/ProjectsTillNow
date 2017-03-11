
class Demos {
	synchronized void dispMsg(String name) { 
		System.out.print("Hello " +name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("   How r u...");
	}
}

class Manoj extends Thread {
	Demos d;
	Manoj(Demos d) {
		this.d=d;
	}
	@Override
	public void run() {
	 
		d.dispMsg("Manoj");
	}
}

class Ayesha extends Thread {
	Demos d;
	Ayesha(Demos d) {
		this.d=d;
		
	}
	@Override
	public void run() {
		d.dispMsg("Ayesha");
	}
}

class Hari extends Thread {
	Demos d;
	Hari(Demos d) {
		this.d=d;
	}
	@Override
	public void run() {
		d.dispMsg("Hari");
	}
}
public class SyncDemo {
	
	public static void main(String[] args) {
		Demos d=new Demos();
		Hari t1=new Hari(d);
		Ayesha t2=new Ayesha(d);
		Manoj t3=new Manoj(d);
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
