import java.util.concurrent.atomic.DoubleAdder;

public class DoubleAdder_5 {
    public static void main(String[] args) {
        DoubleAdder adder = new DoubleAdder();
        adder.add(5);
        adder.add(10);
        System.out.println(adder.sum());  // Outputs: 15.0

        adder.reset();
        System.out.println(adder.sum());  // Outputs: 0.0
    }
}
