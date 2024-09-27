import java.util.concurrent.RecursiveTask;

public class MyTask extends RecursiveTask<Integer> {
    private final int threshold;
    private final int[] data;
    private int start;
    private int end;

    public MyTask(int[] data, int start, int end, int threshold) {
        this.data = data;
        this.start = start;
        this.end = end;
        this.threshold = threshold;
    }

    @Override
    protected Integer compute() {
        if (end - start <= threshold) {
            return computeDirectly();
        } else {
            int mid = (start + end) >>> 1;
            MyTask leftTask = new MyTask(data, start, mid, threshold);
            MyTask rightTask = new MyTask(data, mid, end, threshold);

            leftTask.fork();
            int rightResult = rightTask.compute();
            int leftResult = leftTask.join();

            return leftResult + rightResult;
        }
    }

    private int computeDirectly() {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += data[i];
        }
        return sum;
    }

    @Override
    protected void setRawResult(Integer value) {
        super.setRawResult(value);
    }
}
