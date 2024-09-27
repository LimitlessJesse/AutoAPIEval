import org.omg.CORBA.Any;
import org.omg.CORBA.DATA_CONVERSION;
import org.omg.CORBA.MARSHAL;

public class Any_1 {
    public static void main(String[] args) {
        Any any = new Any();
        String value = "Hello World";
        
        try {
            any.insert_string(value);
            System.out.println("String inserted successfully: " + any.extract_string());
        } catch (DATA_CONVERSION | MARSHAL e) {
            System.out.println("Error inserting string: " + e.getMessage());
        }
    }
}
