import java.util.concurrent.CountedCompleter;

public class CountedCompleter_4 {
    public static void main(String[] args) {
        // Create a new CountedCompleter object
        MyCountedCompleter completer = new MyCountedCompleter();
        // Set the pending count using setPendingCount method
        completer.setPendingCount(5);
        // Get the pending count using getPendingCount method
        int count = completer.getPendingCount();
        System.out.println("Pending Count: " + count);
    }

    static class MyCountedCompleter extends CountedCompleter<Void> {

        @Override
        public void compute() {
            // Implement compute method
        }
    }
}
