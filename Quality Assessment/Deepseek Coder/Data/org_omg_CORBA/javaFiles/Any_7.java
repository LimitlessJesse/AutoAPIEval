import org.omg.CORBA.Any;
import org.omg.CORBA.FloatHolder;

public class Any_7 {
    public static void main(String[] args) {
        Any any = new Any();
        float value = 3.14f;
        insert_float(any, value);
    }

    public static void insert_float(Any any, float value) {
        FloatHolder fHolder = new FloatHolder(value);
        any.insert_float(fHolder);
    }
}
