import java.io.PrintWriter;

public class PrintWriter_2 {
    public static void main(String[] args) {
        PrintWriter writer = new PrintWriter(System.out);
        writer.println("Hello, World!");
        writer.flush();
    }
}
