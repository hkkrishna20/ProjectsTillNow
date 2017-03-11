import java.util.ArrayList;
import java.util.List;


public class ArrInt {
	
	public static void main(String[] args) {
		List lstData=new ArrayList();
		lstData.add(new Integer(42));
		lstData.add(new Integer(52));
		lstData.add(new Integer(65));
		lstData.add(new Integer(24));
		lstData.add(new Integer(78));
		int sum=0;
		for (Object ob : lstData) {
			sum+=(Integer)ob;
		}
		System.out.println("Sum is " +sum);
		
	}

}
