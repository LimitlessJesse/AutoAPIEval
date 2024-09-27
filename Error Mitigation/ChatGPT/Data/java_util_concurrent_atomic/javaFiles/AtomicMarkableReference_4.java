import java.util.concurrent.atomic.AtomicMarkableReference;

public class AtomicMarkableReference_4 {
    public static void main(String[] args) {
        AtomicMarkableReference<String> reference = new AtomicMarkableReference<>("Hello", true);
        boolean isMarked = reference.isMarked();
        System.out.println("Is marked: " + isMarked);
    }
}
