import java.util.concurrent.atomic.DoubleAdder;

public class DoubleAdder_4 {
    public static void main(String[] args) {
        DoubleAdder doubleAdder = new DoubleAdder();
        doubleAdder.add(10.5);
        doubleAdder.add(20.3);
        double sum = doubleAdder.sum();
        System.out.println("Sum: " + sum);
    }
}
