import java.util.concurrent.CountedCompleter;

public class CountedCompleter_2 {
    public static void main(String[] args) {
        CountedCompleter completer = new CountedCompleter() {
            @Override
            public void compute() {
                // Implement compute logic here
            }
        };

        CountedCompleter parent = (CountedCompleter) completer.getCompleter();
        System.out.println("Parent completer: " + parent);
    }
}
