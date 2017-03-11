import java.util.Arrays;


public class Array {
 public static void main(String[] args) {
	 int a[]=new int[]{12,4,56,34,25};
	/* for(int i=0;i<a. length; i++) {
		 System.out.println("Elements at "+i+" is "+a[i]);
	 }*/
	 for(int i : a){
		 System.out.println(i);
	 }
	 String[] names=new String[]{"Venkat","Sai","Manoj","Hari"};
	 for(String s : names){
		 System.out.println(s);
	 }
	 Arrays.sort(names);
	 System.out.println("List befor sorting");
	 for (String s : names) {
		 System.out.println(s);
	 }
	
}
}
