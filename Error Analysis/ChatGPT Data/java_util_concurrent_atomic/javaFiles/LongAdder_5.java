import java.util.concurrent.atomic.LongAdder;

public class LongAdder_5 {
    public static void main(String[] args) {
        LongAdder adder = new LongAdder();
        adder.add(10);
        System.out.println("Current value: " + adder.sum());
        
        adder.reset();
        System.out.println("Value after reset: " + adder.sum());
    }
}
