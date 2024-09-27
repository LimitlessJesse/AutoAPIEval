import javax.xml.transform.stax.StAXResult;
import javax.xml.stream.XMLStreamWriter;

public class StAXResult_1 {
    public static void main(String[] args) {
        StAXResult staxResult = new StAXResult();
        XMLStreamWriter xmlStreamWriter = staxResult.getXMLStreamWriter();
        
        if(xmlStreamWriter != null) {
            // Use the XMLStreamWriter for further operations
            System.out.println("XMLStreamWriter used by this StAXResult: " + xmlStreamWriter.toString());
        } else {
            System.out.println("XMLStreamWriter is null");
        }
    }
}
