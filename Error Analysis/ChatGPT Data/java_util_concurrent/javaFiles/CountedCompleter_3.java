import java.util.concurrent.CountedCompleter;

public class CountedCompleter_3 {
    public static void main(String[] args) {
        MyCountedCompleter task = new MyCountedCompleter(null, 0);
        int pendingCount = task.getPendingCount();
        System.out.println("Pending count: " + pendingCount);
    }

    static class MyCountedCompleter extends CountedCompleter<Void> {
        MyCountedCompleter(CountedCompleter<?> completer, int initialPendingCount) {
            super(completer, initialPendingCount);
        }
        
        @Override
        public void compute() {
            // Perform computation
        }
    }
}
