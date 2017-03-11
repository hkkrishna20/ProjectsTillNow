import java.io.*;
public class PlayingCard
{	
	public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String args[])throws IOException
		{
			String s=new String();
			String card=new String();
			
			System.out.print("Enter the Card Code ? ");
			card=br.readLine();
			char c1=card.charAt(0);
			char c2=card.charAt(1);
			switch(c2)
				{	
				case 'S':{
						s=getString(c1);
						System.out.println(s+" of Spade");
						break;
					}
				case 'C':{
						s=getString(c1);
						System.out.println(s+" of Club ");
						break;
					}
				case 'D':{
						s=getString(c1);
						System.out.println(s+" of Diamond");
						break;
					}
				case 'H':{
						s=getString(c1);
						System.out.println(s+" of Heart");
						break;
					}
				default:System.out.println("Invalid Card");
				}
		}
	
	public static String getString(char c1){
	String p;
		switch(c1)
		{
			case 'A':p= "ace";break;
			case '2':p= "Two";break;
			case '3':p= "Three";break;
			case '4':p= "Four";break;
			case '5':p= "Five";break;
			case '6':p= "Six";break;
			case '7':p= "Seven";break;
			case '8':p= "Eight";break;
			case '9':p= "Nine";break;
			case 'T':p= "Ten";break;
			case 'J':p= "Jack";break;
			case 'Q':p= "Queen";break;
			case 'K':p= "King";break;
			default:p= null;
			
		}
		return p;
	}
	

	
	
}

