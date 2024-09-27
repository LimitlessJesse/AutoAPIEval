import java.util.concurrent.ForkJoinTask;

public class ForkJoinTask_2 {
    public static void main(String[] args) {
        ForkJoinTask<String> task = new ForkJoinTask<String>() {
            @Override
            public String getRawResult() {
                return "Result";
            }

            @Override
            protected void setRawResult(String value) {
                // Do nothing
            }

            @Override
            protected boolean exec() {
                return true;
            }
        };

        String result = task.join();
        System.out.println("Result: " + result);
    }
}
