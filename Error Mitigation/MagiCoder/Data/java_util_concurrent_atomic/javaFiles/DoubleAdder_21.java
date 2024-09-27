import java.util.concurrent.atomic.DoubleAdder;

public class DoubleAdder_21 {
    public static void main(String[] args) {
        DoubleAdder adder = new DoubleAdder();
        adder.add(5.0);
        adder.add(10.0);
        System.out.println("Current sum: " + adder.sum());
        adder.reset();
        System.out.println("After reset, sum: " + adder.sum());
    }
}
