
public class Max3 {

	public void check(int a,int b,int c) {
		int m=a;
		
		if(m<b) {
			m=b;
		}
		if(m<c) {
			m=c;
		}
		System.out.println("Max =" +m);
		
				}
	public static void main(String[] args) {
		int a,b,c;
		a=8;
		b=4;
		c=7;
		Max3 obj=new Max3();
		obj.check(a, b, c);
	}
}
