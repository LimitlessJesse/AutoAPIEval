import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class StreamSupport_1 {
    public static void main(String[] args) {
        Spliterator<String> spliterator = new MySpliterator();
        Stream<String> stream = StreamSupport.stream(spliterator, false);
        stream.forEach(System.out::println);
    }
}

class MySpliterator implements Spliterator<String> {
    // Implement your Spliterator methods here
}
