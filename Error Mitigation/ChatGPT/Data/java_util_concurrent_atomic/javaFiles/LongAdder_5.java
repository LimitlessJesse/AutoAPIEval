import java.util.concurrent.atomic.LongAdder;

public class LongAdder_5 {
    public static void main(String[] args) {
        LongAdder adder = new LongAdder();
        adder.increment();
        System.out.println("Current sum: " + adder.sum());
        
        adder.reset();
        System.out.println("Sum after reset: " + adder.sum());
    }
}
