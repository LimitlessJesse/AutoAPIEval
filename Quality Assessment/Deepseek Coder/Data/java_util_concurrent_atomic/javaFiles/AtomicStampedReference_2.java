import java.util.concurrent.atomic.AtomicStampedReference;

public class AtomicStampedReference_2 {
    public static void main(String[] args) {
        String initialRef = "Hello";
        int initialStamp = 0;
        AtomicStampedReference<String> ref = new AtomicStampedReference<>(initialRef, initialStamp);

        int stamp = ref.getStamp();
        System.out.println("Stamp: " + stamp);
    }
}
