import org.omg.CORBA.Any;

public class Any_3 {
    public static void main(String[] args) {
        Any any = new Any();
        float value = 3.14f;
        any.insert_float(value);
    }
}
