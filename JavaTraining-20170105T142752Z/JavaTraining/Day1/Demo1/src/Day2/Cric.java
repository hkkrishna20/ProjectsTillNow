package Day2;

public class Cric {
	
	static int score;
	
	public void incr(int x) {
		score+=x;
	}
	
	public static void main(String[] args) {
		Cric fb=new Cric();
		fb.incr(54);
		Cric sb=new Cric();
		sb.incr(22);
		Cric ext=new Cric();
		ext.incr(2);
		System.out.println("Total Score " +Cric.score);
	}

}
