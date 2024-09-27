import java.io.PrintWriter;

public class PrintWriter_1 {
    public static void main(String[] args) {
        PrintWriter writer = new PrintWriter(System.out);
        writer.print("Hello, World!");
        writer.flush();
    }
}
