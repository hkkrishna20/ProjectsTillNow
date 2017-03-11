import java.io.*;
import java.util.*;
public class StringTokenizerExample
{
  public static void main(String args[])
	{
	String line = "abc|def?ghi";
	StringTokenizer st = new StringTokenizer(line, "|?");
	while (st.hasMoreTokens())
	  {
	    String s = st.nextToken();
	    System.out.println("Token is " + s);
	  }
	}
}