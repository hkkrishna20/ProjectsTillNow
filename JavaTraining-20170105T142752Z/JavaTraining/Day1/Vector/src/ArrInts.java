import java.util.ArrayList;
import java.util.List;


public class ArrInts {
	public static void main(String[] args) {
		List<Integer> lst=new ArrayList<Integer>( );
		lst.add(new Integer(23));
		lst.add(new Integer(64));
		lst.add(new Integer(3));
		lst.add(new Integer(54));
		lst.add(new Integer(6));
		int sum=0;
		for(Integer i : lst) {
			sum+=i;
		}
		System.out.println("Sum is " +sum);
	}

}
