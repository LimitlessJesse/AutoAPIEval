import java.util.concurrent.RecursiveTask;

public class RecursiveTask_1 {
    
    public static void main(String[] args) {
        // Example usage of compute() method from RecursiveTask
        MyRecursiveTask task = new MyRecursiveTask(10);
        Integer result = task.compute();
        System.out.println(result);
    }
    
    static class MyRecursiveTask extends RecursiveTask<Integer> {
        private int n;
        
        MyRecursiveTask(int n) {
            this.n = n;
        }
        
        @Override
        protected Integer compute() {
            if (n <= 1) {
                return n;
            } else {
                MyRecursiveTask task1 = new MyRecursiveTask(n - 1);
                MyRecursiveTask task2 = new MyRecursiveTask(n - 2);
                task1.fork();
                return task2.compute() + task1.join();
            }
        }
    }
}
