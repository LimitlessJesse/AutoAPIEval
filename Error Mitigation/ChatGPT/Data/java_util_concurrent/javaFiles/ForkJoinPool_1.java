import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class ForkJoinPool_1 {
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        
        ForkJoinTask<?> task = new ForkJoinTask<Object>() {
            @Override
            public Object getRawResult() {
                return null;
            }

            @Override
            protected void setRawResult(Object value) {
            }

            @Override
            protected boolean exec() {
                System.out.println("Executing task");
                return true;
            }
        };
        
        forkJoinPool.execute(task);
    }
}
