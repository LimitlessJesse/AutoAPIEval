import java.io.PrintWriter;

public class PrintWriter_3 {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        pw.print("Hello");
        pw.flush();
    }
}
