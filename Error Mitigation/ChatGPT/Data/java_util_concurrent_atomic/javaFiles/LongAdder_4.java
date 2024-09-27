import java.util.concurrent.atomic.LongAdder;

public class LongAdder_4 {
    public static void main(String[] args) {
        LongAdder adder = new LongAdder();
        adder.add(10);
        adder.add(20);
        System.out.println("Current sum: " + adder.sum());
    }
}
