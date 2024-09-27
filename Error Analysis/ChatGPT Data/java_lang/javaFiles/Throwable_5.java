import java.lang.Throwable;

public class Throwable_5 {
    public static void main(String[] args) {
        try {
            throw new Exception("This is an error message");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
