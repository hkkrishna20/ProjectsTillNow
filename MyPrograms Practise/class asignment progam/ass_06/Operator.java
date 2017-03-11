public class Operator
{
	public static void main(String args[])
	{	
		double a=Double.parseDouble(args[0]);
		double b=Double.parseDouble(args[2]);
		
		double res;
		if(args.length!=3)
			{
				System.out.println("Only three arguments required");
			}
		else
			{
				switch(args[1].charAt(0))
				{
					case '*':res=a*b;System.out.print(res);break;
					/*case '-':res=a-b;show1("difference",res);break;
					case '*':res=a*b;show1("product",res);break;
					case '%':res=a%b;show1("remainder",res);break;
					case '/':res=a/b;show1("quotient",res);break;*/
					default:System.out.println("Invalid Operator!!");
				}
			}
	}

	
			
}