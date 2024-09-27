import java.io.PrintWriter;

public class PrintWriter_5 {
    public static void main(String[] args) {
        PrintWriter writer = new PrintWriter(System.out);
        writer.print(true);
        writer.flush();
    }
}
