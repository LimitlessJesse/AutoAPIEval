import java.util.concurrent.RecursiveTask;

public class MyRecursiveTask extends RecursiveTask<String> {

    protected String compute() {
        // Some computation here
        String result = "Hello, World!";
        setRawResult(result);
        return result;
    }

    public static void main(String[] args) {
        MyRecursiveTask task = new MyRecursiveTask();
        task.fork(); // Start the task
        System.out.println(task.join()); // Wait for the task to complete and get the result
    }
}
