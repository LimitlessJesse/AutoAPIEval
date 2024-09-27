import java.util.concurrent.atomic.AtomicMarkableReference;

public class AtomicMarkableReference_2 {
    public static void main(String[] args) {
        AtomicMarkableReference<String> ref = new AtomicMarkableReference<>("Hello", false);
        System.out.println(ref.getReference());
    }
}
