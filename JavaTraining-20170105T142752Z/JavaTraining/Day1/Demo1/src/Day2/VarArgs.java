package Day2;

public class VarArgs {
 
	public void show(String... name) {
		for (String s : name) {
			System.out.print(s+  "  " );
					}
	System.out.println();
	 
 }
	public static void main(String[] args) {
		VarArgs obj=new VarArgs();
		obj.show();
		obj.show("venkat");
		obj.show("venkat","sai");
		obj.show("Venkat", "sai","manoj");
	}
}
