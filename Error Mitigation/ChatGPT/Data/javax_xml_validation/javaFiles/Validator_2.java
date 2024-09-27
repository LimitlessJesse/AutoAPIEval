import javax.xml.validation.Validator;
import org.xml.sax.ErrorHandler;

public class Validator_2 {
    public static void main(String[] args) {
        Validator validator = null; // Initialize your Validator object here
        
        // Create a custom ErrorHandler
        ErrorHandler customErrorHandler = new CustomErrorHandler();
        
        // Set the custom ErrorHandler to the Validator
        validator.setErrorHandler(customErrorHandler);
    }
    
    static class CustomErrorHandler implements ErrorHandler {
        @Override
        public void warning(org.xml.sax.SAXParseException exception) {
            // Handle warning
        }

        @Override
        public void error(org.xml.sax.SAXParseException exception) {
            // Handle error
        }

        @Override
        public void fatalError(org.xml.sax.SAXParseException exception) {
            // Handle fatal error
        }
    }
}
