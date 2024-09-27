import java.util.concurrent.RecursiveTask;

public class RecursiveTask_1 {
    public static void main(String[] args) {
        MyTask task = new MyTask(10);
        task.fork();
        System.out.println(task.getRawResult());
    }
}

class MyTask extends RecursiveTask<Integer> {
    private final int n;

    MyTask(int n) {
        this.n = n;
    }

    @Override
    protected Integer compute() {
        if (n <= 1)
            return n;
        MyTask f1 = new MyTask(n - 1);
        f1.fork();
        MyTask f2 = new MyTask(n - 2);
        return f2.compute() + f1.join();
    }
}
