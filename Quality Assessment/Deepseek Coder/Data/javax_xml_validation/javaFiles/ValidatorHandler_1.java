import javax.xml.validation.ErrorHandler;
import javax.xml.validation.Validator;
import javax.xml.validation.ValidatorHandler;

public class ValidatorHandler_1 {
    public static void main(String[] args) {
        ValidatorFactory factory = ValidatorFactory.newInstance();
        Validator validator = factory.newValidator();
        ValidatorHandler handler = validator.getValidatorHandler();

        handler.setErrorHandler(new ErrorHandler() {
            @Override
            public void warning(SAXParseException exception) throws SAXException {
                System.out.println("Warning: " + exception.getMessage());
            }

            @Override
            public void error(SAXParseException exception) throws SAXException {
                System.out.println("Error: " + exception.getMessage());
            }

            @Override
            public void fatalError(SAXParseException exception) throws SAXException {
                System.out.println("Fatal Error: " + exception.getMessage());
            }
        });
    }
}
