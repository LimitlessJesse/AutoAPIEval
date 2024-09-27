import java.util.concurrent.atomic.LongAdder;

public class LongAdder_1 {
    public static void main(String[] args) {
        LongAdder longAdder = new LongAdder();
        longAdder.add(10);
        System.out.println("Sum after adding: " + longAdder.sum());
    }
}
