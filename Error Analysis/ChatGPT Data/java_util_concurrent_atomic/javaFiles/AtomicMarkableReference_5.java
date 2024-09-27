import java.util.concurrent.atomic.AtomicMarkableReference;

public class AtomicMarkableReference_5 {
    public static void main(String[] args) {
        AtomicMarkableReference<String> ref = new AtomicMarkableReference<>("Initial", false);
        String value = ref.getReference();
        System.out.println("Initial value: " + value);
    }
}
