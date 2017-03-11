
public class ArrEx {

	public static void main(String[] args) {
		int[] a=new int[]{12,4, };
		try {
			a[10]=667;
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array size is small");
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
