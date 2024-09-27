import java.io.PrintWriter;

public class PrintWriter_2 {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        out.println("Hello, World!");
        out.flush();
    }
}
