import org.omg.CORBA.Any;
import org.omg.CORBA.DATA_CONVERSION;

public class Any_9 {
    public static void main(String[] args) {
        Any any = new Any();
        try {
            any.insert_char('a');
        } catch (DATA_CONVERSION e) {
            e.printStackTrace();
        }
    }
}
