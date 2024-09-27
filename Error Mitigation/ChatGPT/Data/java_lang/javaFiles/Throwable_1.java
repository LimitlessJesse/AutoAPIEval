import java.lang.Throwable;

public class Throwable_1 {
    public static void main(String[] args) {
        try {
            throw new Exception("This is an example exception");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
