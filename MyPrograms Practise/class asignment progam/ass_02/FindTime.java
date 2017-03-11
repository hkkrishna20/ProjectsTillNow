import java.lang.Math.*;
class Time
{
	public double distance;
	public double time;
	public double speed;
	
	public double findTime()
		{
			return (distance/speed);
		}
}

public class FindTime
	{
		public static void main(String args[])
			{
				Time t=new Time();
				t.distance=150*100000*1000;
				t.speed=299792458;
				System.out.println("Time taken=Approximately "+Math.round(t.findTime())+" seconds");
			
			}
	}