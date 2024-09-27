import java.lang.Throwable;

public class Throwable_3 {
    public static void main(String[] args) {
        try {
            throwException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void throwException() throws Exception {
        throw new Exception("This is an example exception");
    }
}
