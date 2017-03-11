public class Cone
{
	public static void main(String args[])
	{	
		
		double h=Double.parseDouble(args[0]);
		double r=Double.parseDouble(args[1]);
		
		double l=Math.sqrt((r*r)+(h*h));
		double area=(2*Math.PI*r*l)+(Math.PI*r*r);
		double vol=(Math.PI*r*r*h)/(double)3;
		
		System.out.println("SurfaceArea="+area);
		System.out.println("Volume="+vol);
		
		
	}
}
		