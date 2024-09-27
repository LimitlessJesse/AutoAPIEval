import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicBoolean_5 {
    public static void main(String[] args) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        
        boolean expect = true;
        boolean update = false;
        
        boolean result = atomicBoolean.weakCompareAndSet(expect, update);
        
        System.out.println("Result: " + result);
        System.out.println("Updated value: " + atomicBoolean.get());
    }
}
