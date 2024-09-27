import java.util.concurrent.CountedCompleter;

public class CountedCompleter_4 {
    public static void main(String[] args) {
        // Create a CountedCompleter task
        CountedCompleter<Void> task = new CountedCompleter<Void>() {
            @Override
            public void compute() {
                // Perform some computation
            }
        };
        
        // Call propagateCompletion method
        task.propagateCompletion();
    }
}
