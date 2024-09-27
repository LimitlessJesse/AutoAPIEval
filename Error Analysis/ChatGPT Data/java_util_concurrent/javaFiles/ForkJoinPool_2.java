import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

public class ForkJoinPool_2 {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        
        RecursiveAction task = new RecursiveAction() {
            @Override
            protected void compute() {
                System.out.println("Executing ForkJoinTask...");
            }
        };
        
        pool.execute(task);
    }
}
