import java.util.concurrent.ForkJoinTask;

public class ForkJoinTask_3 {
    public static void main(String[] args) {
        ForkJoinTask<String> task = new ForkJoinTask<String>() {
            @Override
            protected boolean exec() {
                return true;
            }
        };
        task.setRawResult("Result");
        System.out.println(task.getRawResult());
    }
}
