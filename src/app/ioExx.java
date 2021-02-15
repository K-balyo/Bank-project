package app;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class ioExx {
	public static void main(String args[])throws Exception {  
		getXmlData(new File("xmlFile.xml"));
    }
	 public static void getXmlData(File xmlFile) throws Exception {
		    
	        // 1. ���� ���丮 ����.
	        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
	                
	        // 2. ���� ���丮�κ��� ���� ����
	        DocumentBuilder builder = builderFactory.newDocumentBuilder();
	        
	        // 3. ������ ���� XML ������ �Ľ��ؼ� Document ��ü�� �����´�.
	        Document document = builder.parse(xmlFile);
	        
	        document.getDocumentElement().normalize();
	        
	        // XML ������ �� <person> �±��� ������ �����´�.
	        NodeList personTagList = document.getElementsByTagName("person");
	        
	        // <person> �±� ����Ʈ�� �ϳ��� ���鼭 ������ �����´�.
	        for (int i = 0; i < personTagList.getLength(); ++i) {
	            // �Ӽ� �� ��������.
	            String name = personTagList.item(i).getAttributes().getNamedItem("sex").getTextContent();
	            System.out.println(name);
	            // <person> �±��� ���� ������ �����´�. ( ���⼭ ���� �±׸� �ǹ��Ѵ�. )
	            NodeList childNodes = personTagList.item(i).getChildNodes();
	            for (int j = 0; j < childNodes.getLength(); ++j) {                
	                if ("name".equals(childNodes.item(j).getNodeName())) {
	                    // do somthing...
	                    System.out.println(childNodes.item(j).getTextContent());
	                }                
	                if ("age".equals(childNodes.item(j).getNodeName())) {
	                    // do somthing...
	                    System.out.println(childNodes.item(j).getTextContent());
	                }
	            }
	        }
	    }

}
