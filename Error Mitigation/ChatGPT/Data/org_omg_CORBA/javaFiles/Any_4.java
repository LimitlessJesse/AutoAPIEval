import org.omg.CORBA.Any;
import org.omg.CORBA.BAD_OPERATION;

public class Any_4 {
    public static void main(String[] args) {
        Any any = new Any();
        any.insert_string("Hello World");
        
        try {
            String extractedString = any.extract_string();
            System.out.println(extractedString);
        } catch (BAD_OPERATION e) {
            System.out.println("Error extracting string: " + e.getMessage());
        }
    }
}
