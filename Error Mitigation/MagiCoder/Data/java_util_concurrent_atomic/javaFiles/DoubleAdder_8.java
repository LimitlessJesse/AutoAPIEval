import java.util.concurrent.atomic.DoubleAdder;

public class DoubleAdder_8 {
    public static void main(String[] args) {
        DoubleAdder adder = new DoubleAdder();
        adder.add(1.0);
        adder.add(2.0);
        double sum = adder.sumThenReset();
        System.out.println("Sum: " + sum);
    }
}
