
public class Factors { 
	public void show(int n) {
		int i=1;
		while (i <=n){
			if (n%i==0) {
				System.out.println("The factors are " +i);
							}
			i++;
		}
	}
 public static void main(String[] args) {
	int n=10;
	Factors obj=new Factors();
	obj.show(n);
}
}
