import java.util.concurrent.atomic.AtomicMarkableReference;

public class AtomicMarkableReference_2 {
    public static void main(String[] args) {
        Object obj = new Object();
        boolean mark = true;
        
        AtomicMarkableReference<Object> atomicMarkableRef = new AtomicMarkableReference<>(obj, mark);
        
        boolean isMarked = atomicMarkableRef.isMarked();
        System.out.println("Is Marked: " + isMarked);
    }
}
