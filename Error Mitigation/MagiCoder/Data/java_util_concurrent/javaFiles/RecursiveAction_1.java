import java.util.concurrent.RecursiveAction;

public class MyRecursiveAction extends RecursiveAction {
    private final int start;
    private final int end;

    public MyRecursiveAction(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        if (end - start <= 10) {
            // Base case: if the range is small enough, compute it directly
            for (int i = start; i < end; i++) {
                // Perform some computation
                System.out.println("Computing " + i);
            }
        } else {
            // Recursive case: split the range into two and compute them concurrently
            int mid = (start + end) / 2;
            MyRecursiveAction left = new MyRecursiveAction(start, mid);
            MyRecursiveAction right = new MyRecursiveAction(mid, end);
            left.fork();
            right.compute();
            left.join();
        }
    }
}

public class RecursiveAction_1 {
    public static void main(String[] args) {
        MyRecursiveAction action = new MyRecursiveAction(0, 100);
        action.compute();
    }
}
