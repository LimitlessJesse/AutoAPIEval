import java.util.concurrent.atomic.LongAdder;

public class LongAdder_3 {
    public static void main(String[] args) {
        LongAdder adder = new LongAdder();
        adder.add(10);
        System.out.println("Current sum: " + adder.sum());

        adder.decrement();
        System.out.println("After decrement: " + adder.sum());
    }
}
