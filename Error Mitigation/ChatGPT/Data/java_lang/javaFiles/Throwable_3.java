import java.lang.Throwable;

public class Throwable_3 {
    public static void main(String[] args) {
        try {
            throw new NullPointerException("Custom exception");
        } catch (NullPointerException e) {
            Throwable cause = e.getCause();
            System.out.println("Cause: " + cause);
        }
    }
}
