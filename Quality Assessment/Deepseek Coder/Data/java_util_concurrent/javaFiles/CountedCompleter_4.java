import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicInteger;

public class MyCountedCompleter extends CountedCompleter<Void> {
    private AtomicInteger counter;

    public MyCountedCompleter(CountedCompleter<?> completer, AtomicInteger counter) {
        super(completer);
        this.counter = counter;
    }

    @Override
    public void compute() {
        // Perform some computation

        // Decrement the counter
        counter.decrementAndGet();

        // If the counter reaches zero, complete this task
        if (counter.get() == 0) {
            tryComplete();
        }
    }
}

public class CountedCompleter_4 {
    public static void main(String[] args) {
        AtomicInteger counter = new AtomicInteger(2);
        CountedCompleter<Void> completer = new MyCountedCompleter(null, counter);

        // Start the tasks
        completer.decrementCount();
        completer.decrementCount();

        // Wait for the tasks to complete
        completer.join();
    }
}
