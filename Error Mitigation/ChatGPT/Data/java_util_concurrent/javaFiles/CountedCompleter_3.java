import java.util.concurrent.CountedCompleter;

public class CountedCompleter_3 {
    public static void main(String[] args) {
        CountedCompleter completer = new CountedCompleter() {
            @Override
            public void compute() {
                // Perform computation
            }
        };
        
        completer.tryComplete();
    }
}
