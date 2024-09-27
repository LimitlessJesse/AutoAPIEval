import java.util.concurrent.CountedCompleter;

public class CountedCompleter_1 {
    public static void main(String[] args) {
        CountedCompleter<Void> completer = new CountedCompleter<Void>(null) {
            @Override
            public void compute() {
                // Implement your computation logic here
            }
        };
        completer.tryComplete();
    }
}
