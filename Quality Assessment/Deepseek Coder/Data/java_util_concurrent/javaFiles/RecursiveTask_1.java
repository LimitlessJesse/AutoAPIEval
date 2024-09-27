import java.util.concurrent.RecursiveTask;

public class RecursiveTask_1 {
    public static void main(String[] args) {
        MyRecursiveTask task = new MyRecursiveTask(10);
        task.fork(); // start the task
        System.out.println(task.getRawResult()); // get the result
    }
}

class MyRecursiveTask extends RecursiveTask<Integer> {
    private final int n;

    MyRecursiveTask(int n) {
        this.n = n;
    }

    @Override
    protected Integer compute() {
        if (n <= 1)
            return n;
        MyRecursiveTask f1 = new MyRecursiveTask(n - 1);
        f1.fork();
        MyRecursiveTask f2 = new MyRecursiveTask(n - 2);
        return f2.compute() + f1.join();
    }
}
