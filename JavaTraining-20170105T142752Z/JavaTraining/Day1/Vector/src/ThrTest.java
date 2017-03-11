import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Vector;

class C3 implements Runnable {
	@Override
	public void run() {
		TreeSet ts=new TreeSet();
		ts.add("Swetha");
		ts.add("Manoj");
		ts.add("nikhil");
		ts.add("ayesha");
		for(Object ob : ts) {
			System.out.println("Tree Set " +ts);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
	}
}
class C2 implements Runnable {
	@Override
	public void run() {
		ArrayList alist=new ArrayList();
		alist.add("Swetha");
		alist.add("Manoj");
		alist.add("nikhil");
		alist.add("ayesha");
		for(Object ob : alist) {
			System.out.println("Array list " +alist);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
		
	}
}
class C1 implements Runnable {
	@Override
	public void run() {
		Vector v=new Vector( );
		v.addElement("Manoj");
		v.addElement("hari");
		v.addElement("sreya");
		v.addElement("mani");
		for(Object ob : v) {
			System.out.println("Vector  " +ob);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			
		}
	}
}
public class ThrTest {
	
	public static void main(String[] args) {
		Runnable obj1=new C1();
		Runnable obj2=new C2();
		Runnable obj3=new C3();
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		Thread t3=new Thread(obj3);
		
		t1.start();
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		t3.start();
		
		
	}

}
