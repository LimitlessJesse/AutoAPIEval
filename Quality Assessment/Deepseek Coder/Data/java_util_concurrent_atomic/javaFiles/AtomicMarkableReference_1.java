import java.util.concurrent.atomic.AtomicMarkableReference;

public class AtomicMarkableReference_1 {
    public static void main(String[] args) {
        AtomicMarkableReference<String> reference = new AtomicMarkableReference<>("Reference", false);
        System.out.println(reference.getReference());
    }
}
