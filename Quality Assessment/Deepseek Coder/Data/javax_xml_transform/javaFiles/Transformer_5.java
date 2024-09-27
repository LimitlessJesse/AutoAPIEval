import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;

public class Transformer_5 {
    public static void main(String[] args) {
        try {
            Source source = new StreamSource(new File("input.xml"));
            Result result = new StreamResult(new File("output.xml"));

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();

            transformer.setErrorListener(new ErrorListener() {
                @Override
                public void error(TransformerException e) throws TransformerException {
                    System.out.println("Error: " + e.getMessage());
                }

                @Override
                public void fatalError(TransformerException e) throws TransformerException {
                    System.out.println("Fatal Error: " + e.getMessage());
                }

                @Override
                public void warning(TransformerException e) throws TransformerException {
                    System.out.println("Warning: " + e.getMessage());
                }
            });

            transformer.transform(source, result);
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}
