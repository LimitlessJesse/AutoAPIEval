import javax.xml.validation.Validator;

public class Validator_2 {
    public static void main(String[] args) {
        Validator validator = null; // initialize validator object
        validator.setFeature("http://apache.org/xml/features/validation/schema", true);
    }
}
