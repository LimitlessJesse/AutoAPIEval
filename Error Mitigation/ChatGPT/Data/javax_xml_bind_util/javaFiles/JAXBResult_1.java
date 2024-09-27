import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.util.JAXBResult;

public class JAXBResult_1 {
    public static void main(String[] args) {
        try {
            JAXBContext context = JAXBContext.newInstance(MyObject.class);
            MyObject myObject = new MyObject();
            JAXBResult result = new JAXBResult(context);
            result.setResult(myObject);
            
            Object unmarshalledObject = result.getResult();
            System.out.println("Unmarshalled object: " + unmarshalledObject);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}

class MyObject {
    // Define your JAXB object here
}
