import javax.xml.transform.ErrorListener;

public class Transformer_4 {
    public static void main(String[] args) {
        // Instantiate a new ErrorListener
        ErrorListener errorListener = new ErrorListener() {
            @Override
            public void warning(javax.xml.transform.TransformerException exception) throws javax.xml.transform.TransformerException {
                System.out.println("Warning: " + exception.getMessage());
            }

            @Override
            public void error(javax.xml.transform.TransformerException exception) throws javax.xml.transform.TransformerException {
                System.out.println("Error: " + exception.getMessage());
            }

            @Override
            public void fatalError(javax.xml.transform.TransformerException exception) throws javax.xml.transform.TransformerException {
                System.out.println("Fatal Error: " + exception.getMessage());
            }
        };

        // Set the error listener
        try {
            setErrorListener(errorListener);
        } catch (IllegalArgumentException e) {
            System.out.println("Error setting error listener: " + e.getMessage());
        }
    }
}
