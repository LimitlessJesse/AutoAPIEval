import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class ForkJoinTask_1 {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask<Void> task = new ForkJoinTask<Void>() {
            @Override
            public Void getRawResult() {
                return null;
            }

            @Override
            protected void setRawResult(Void value) {
            }

            @Override
            protected boolean exec() {
                return false;
            }
        };
        task.fork();
    }
}
