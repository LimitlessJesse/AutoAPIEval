import java.util.concurrent.ForkJoinTask;

public class ForkJoinTask_4 {
    public static void main(String[] args) {
        ForkJoinTask<Boolean> task = new ForkJoinTask<Boolean>() {
            @Override
            public Boolean exec() {
                // Add your implementation here
                return true;
            }
        };
        
        boolean result = task.invoke();
        System.out.println("Result: " + result);
    }
}
