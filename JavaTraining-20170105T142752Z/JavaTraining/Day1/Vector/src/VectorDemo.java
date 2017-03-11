import java.util.Vector;


public class VectorDemo {
	
	public static void main(String[] args) {
		Vector v=new Vector(3,2);
		System.out.println("Size " +v.size());
		System.out.println("Capacity " +v.capacity());
		v.addElement("Manoj");
		v.addElement("venkat");
		System.out.println("Size " +v.size());
		System.out.println("Capacity " +v.capacity());
		v.addElement("sreya");
		System.out.println("Size " +v.size());
		System.out.println("Capacity " +v.capacity());
		v.addElement("mani");
		System.out.println("Size " +v.size());
		System.out.println("Capacity " +v.capacity());
		v.addElement("nikhil");
		v.addElement("sreya");
		System.out.println("Size " +v.size());
		System.out.println("Capacity " +v.capacity());
	}

}
