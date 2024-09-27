import org.omg.CORBA.Any;
import org.omg.CORBA.DoubleHolder;

public class Any_8 {
    public static void main(String[] args) {
        Any any = new Any();
        DoubleHolder dh = new DoubleHolder();
        dh.value = 123.45;
        any.insert_double(dh.value);
        System.out.println(any.toString());
    }
}
