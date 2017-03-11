
public class CircleDemo {
	
	public void calc(double radius) {
		double area,circ;
		area=Math.PI*radius*radius;
		circ=2*Math.PI*radius;
		System.out.println("The area is" +area);
		System.out.println(" The circumference is" +circ);
	}
	public static void main(String[] args) {
		
		double radius=12.5;
		CircleDemo obj= new CircleDemo();
		obj.calc(radius);
	}

}
