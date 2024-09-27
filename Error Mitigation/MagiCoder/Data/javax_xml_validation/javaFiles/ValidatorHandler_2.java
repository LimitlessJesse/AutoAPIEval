import javax.xml.validation.ValidatorHandler;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXParseException;

public class ValidatorHandler_2 {
    public static void main(String[] args) {
        ValidatorHandler validatorHandler = new ValidatorHandler() {
            @Override
            public void setErrorHandler(ErrorHandler errorHandler) {
                // Implementation of the setErrorHandler method
            }
        };

        validatorHandler.setErrorHandler(new ErrorHandler() {
            @Override
            public void warning(SAXParseException exception) {
                System.out.println("Warning: " + exception.getMessage());
            }

            @Override
            public void error(SAXParseException exception) {
                System.out.println("Error: " + exception.getMessage());
            }

            @Override
            public void fatalError(SAXParseException exception) {
                System.out.println("Fatal Error: " + exception.getMessage());
            }
        });
    }
}
