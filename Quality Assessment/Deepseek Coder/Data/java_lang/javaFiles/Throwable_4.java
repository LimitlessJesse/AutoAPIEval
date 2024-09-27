import java.util.ArrayList;

public class Throwable_4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        try {
            list.add("Hello");
            list.get(1); // This will throw an exception
        } catch (IndexOutOfBoundsException e) {
            Throwable cause = e.getCause();
            if (cause!= null) {
                System.out.println("Cause: " + cause.toString());
            } else {
                System.out.println("No cause");
            }
        }
    }
}
