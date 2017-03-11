
public class CtoF {
	
	public void convert(double c) {
		
		double F;
		F= (c*1.8)+32;
		System.out.println("F is" +F);
	}
	public static void main(String[] args) { 
		double c=37;
		CtoF obj=new CtoF();
		obj.convert(c);
	}

}
