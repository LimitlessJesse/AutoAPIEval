import java.util.concurrent.atomic.AtomicMarkableReference;

public class AtomicMarkableReference_3 {
    public static void main(String[] args) {
        AtomicMarkableReference<String> reference = new AtomicMarkableReference<>("Initial Value", false);
        reference.set("New Value", true);
        System.out.println("Reference: " + reference.getReference() + ", Mark: " + reference.isMarked());
    }
}
