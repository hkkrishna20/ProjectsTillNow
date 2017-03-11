package Day2;

public class TimeZone {

		int hrs,min;
		
		public TimeZone() {
			
		}
		
		public TimeZone ( int hrs, int min) {
			this.hrs=hrs;
			this.min=min;
		}
		
		public TimeZone sum(TimeZone T1, TimeZone T2) {
			TimeZone T3=new TimeZone();
			T3.hrs=T1.hrs+T2.hrs;
			T3.min=T1.min+T2.min;
			
			if(T3.min>60) {
				
				T3.hrs=T3.hrs+1;
				T3.min=T3.min-60;
			}
			return T3;
		}
			
			public TimeZone sub(TimeZone T1, TimeZone T2) {
				TimeZone T4=new TimeZone();
				T4.hrs=T1.hrs-T2.hrs;
				T4.min=T1.min-T2.min;
				
				if(T4.min<0) {
					
					T4.hrs=T4.hrs-1;
					T4.min=T4.min+60;
				}
			return T4;
		}
		
		@Override
		public String toString() {
		
		return hrs+ " :" + min;
		}
		
		public static void main(String[] args) {
			TimeZone T1=new TimeZone(3,40);
			TimeZone T2=new TimeZone(2,30);
			TimeZone T3=new TimeZone();
			TimeZone T4=new TimeZone();
			T3=T3.sum(T1, T2);
			T4=T4.sub(T1,T2);
			System.out.println(T1);
			System.out.println(T2);
			System.out.println(T3);
			System.out.println(T4);
			
		}
}
