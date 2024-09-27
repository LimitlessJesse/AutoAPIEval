import java.util.concurrent.atomic.DoubleAdder;

public class DoubleAdder_6 {
    public static void main(String[] args) {
        DoubleAdder adder = new DoubleAdder();
        adder.add(10.5);
        adder.add(20.5);
        int sum = adder.intValue();
        System.out.println("Sum: " + sum);
    }
}
