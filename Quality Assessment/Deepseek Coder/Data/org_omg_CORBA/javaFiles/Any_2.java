import org.omg.CORBA.Any;
import org.omg.CORBA.BooleanHolder;

public class Any_2 {
    public static void main(String[] args) {
        Any any = new Any();
        BooleanHolder bh = new BooleanHolder(true);
        any.insert_boolean(bh.value);
        System.out.println(any.toString());
    }
}
