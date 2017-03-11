import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patternn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Pattern pattern = Pattern.compile("<(\\w+)( +.+)*>((.*))</\\1>");
		    System.out.println(pattern.matcher("<asd> TEST</asd>").find());
		    System.out.println(pattern.matcher("<asd TEST</asd>").find());
		    System.out.println(pattern.matcher("<asd attr='3'> TEST</asd>").find());
		    System.out.println(pattern.matcher("<asd> <x>TEST<x>asd>").find());
		    System.out.println("-------");
		    Matcher matcher = pattern.matcher("<as x> TEST</as>");
		    if (matcher.find()) {
		        for (int i = 0; i < matcher.groupCount(); i++) {
		            System.out.println(i + ":" + matcher.group(i));
		        }
		    }
	}

}
