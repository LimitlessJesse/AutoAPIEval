import java.util.concurrent.atomic.DoubleAdder;

public class DoubleAdder_1 {
    public static void main(String[] args) {
        DoubleAdder doubleAdder = new DoubleAdder();
        doubleAdder.add(10.5);
        System.out.println(doubleAdder.doubleValue());
    }
}
