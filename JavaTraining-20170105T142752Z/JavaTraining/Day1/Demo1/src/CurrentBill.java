
public class CurrentBill {
	public void show(int U) {
		double rate=0;
		if (U<=100) {
			rate=U*1.20;
		}
		if (U>100 & U<=160) {
			rate= 120+(U-100)*1.4;
		}
		if(U>160 & U<=220) {
			rate=204+(U-160)*1.8;
		}
		if(U>220) {
			rate=312+(U-220)*2.1;
		}
		System.out.println("The final bill is " +rate);
	}
	public static void main(String[] args) {
		int U=60;
		CurrentBill obj=new CurrentBill();
		obj.show(U);
	}
}
