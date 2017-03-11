public class Speed{
		public static void main(String [ ] args){
				Speed objRef= new Speed( );
				//double speed= objRef.calSpeed(-10.0, 5.0);
				double speed= objRef.calSpeed(10.0, -5.0);
				System.out.println("Speed (Km\\h): "+speed);
				}

	private double calSpeed(double distance, double time){
			assert distance >=0.0;
			assert time>0.0: "Time is not a positive value: "+time;
			double speed=distance/time;
			assert speed >0;
			return speed;				
	}
}