
public class Forloop { 
	public void show(int n) {
		int sum=0,i=1;
		for (i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if (sum==n) {
			System.out.println("The number perfect number");
		}
		else {
			System.out.println("The number is not perfect");
		}
	}
 public static void main(String[] args) {
	int n=6;
	Forloop obj=new Forloop();
	obj.show(n);
}
}