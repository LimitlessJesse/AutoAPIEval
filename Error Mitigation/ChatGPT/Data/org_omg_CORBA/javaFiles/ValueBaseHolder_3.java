import org.omg.CORBA.TypeCode;
import org.omg.CORBA.ValueBaseHolder;

public class ValueBaseHolder_3 {
    public static void main(String[] args) {
        ValueBaseHolder holder = new ValueBaseHolder();
        TypeCode typeCode = holder._type();
        System.out.println("TypeCode: " + typeCode);
    }
}
