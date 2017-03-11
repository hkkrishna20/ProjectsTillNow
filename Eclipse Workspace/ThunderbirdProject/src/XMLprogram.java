import java.io.*;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import org.xml.sax.InputSource;

//public class ParseXMLString {
public class XMLprogram {
  public static void main(String arg[]) {
     String xmlRecords =
      "<data>" +
      " <employee>" +
      "   <name>Mani</name>" +
      "   <title>Immadisetty</title>" +
      " </employee>" +
      " <employee>" +
      "   <name>Swetha</name>" +
      "   <title>Reddy</title>" +
      " </employee>" +
      " <employee>" +
      "   <name>Sreya</name>" +
      "   <title>N</title>" +
      " </employee>" +
      " <employee>" +
      "   <name>Sravani</name>" +
      "   <title>C</title>" +
      " </employee>" +
      "</data>";

     try {
         BufferedReader bf = new BufferedReader(
           new InputStreamReader(System.in));
         System.out.print("Enter XML File name: ");
         String xmlFile = bf.readLine();
         File file = new File(xmlFile);
         if(file.exists()){

             DocumentBuilderFactory factory = 
               DocumentBuilderFactory.newInstance();

             DocumentBuilder builder = factory.newDocumentBuilder();
             org.w3c.dom.Document doc = builder.parse(xmlFile);

             NodeList list = doc.getElementsByTagName("*");
             System.out.println("XML Elements: ");
             for (int i=0; i<list.getLength(); i++) {

                 Element element = (Element)list.item(i);
                 System.out.println(element.getNodeName());
             }
         }
         else{
                 System.out.print("File not found!");
             }
         }
     catch (Exception e) {
         System.exit(1);
     }

    try {
        DocumentBuilderFactory dbf =
            DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        InputSource is = new InputSource();
        is.setCharacterStream(new StringReader(xmlRecords));

        Document doc = db.parse(is);
        NodeList nodes = doc.getElementsByTagName("employee");

        // iterate the employees
        for (int i = 0; i < nodes.getLength(); i++) {
           Element element = (Element) nodes.item(i);

           NodeList name = element.getElementsByTagName("name");
           Element line = (Element) name.item(0);
           System.out.println("Name: " + getCharacterDataFromElement(line));

           NodeList title = element.getElementsByTagName("title");
           line = (Element) title.item(0);
           System.out.println("Title: " + getCharacterDataFromElement(line));
        }
    }
    catch (Exception e) {
        e.printStackTrace();
    }
    /*
    output :
        Name: John
        Title: Manager
        Name: Sara
        Title: Clerk
    */    
    
  }

  public static String getCharacterDataFromElement(Element e) {
    Node child = e.getFirstChild();
    if (child instanceof CharacterData) {
       CharacterData cd = (CharacterData) child;
       return cd.getData();
    }
    return "?";
  }
}