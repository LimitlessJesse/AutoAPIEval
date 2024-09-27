import java.io.PrintWriter;

public class PrintWriter_5 {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter(System.out)) {
            writer.format("Hello, %s! The answer to life, the universe, and everything is %d", "World", 42);
        }
    }
}
