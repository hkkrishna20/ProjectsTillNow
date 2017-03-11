package Day2;

public class FunEx {
	
	public int sum() {
		return 4;
	}
	public int sum(int x) {
		return x+5;
	}
	public int sum(int x, int y) {
		return x+y;
	}
	public static void main(String[] args) {
		FunEx obj=new FunEx();
		int res=obj.sum();
		System.out.println("Res " +res);
		res=obj.sum(12);
		System.out.println("Res " +res);
		res=obj.sum(12,5);
		System.out.println("Res " +res);
		
	}

}
