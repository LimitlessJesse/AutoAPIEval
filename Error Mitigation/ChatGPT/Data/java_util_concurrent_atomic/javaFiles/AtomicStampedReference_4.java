import java.util.concurrent.atomic.AtomicStampedReference;

public class AtomicStampedReference_4 {
    public static void main(String[] args) {
        AtomicStampedReference<String> atomicStampedReference = new AtomicStampedReference<>("InitialValue", 0);
        
        System.out.println("Before set: " + atomicStampedReference.getReference() + " - Stamp: " + atomicStampedReference.getStamp());
        
        atomicStampedReference.set("NewValue", 1);
        
        System.out.println("After set: " + atomicStampedReference.getReference() + " - Stamp: " + atomicStampedReference.getStamp());
    }
}
