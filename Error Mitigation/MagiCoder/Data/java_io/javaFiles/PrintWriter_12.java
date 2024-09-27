import java.io.PrintWriter;
import java.io.StringWriter;

public class PrintWriter_12 {
    public static void main(String[] args) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        pw.println("Hello, World!");
        pw.flush();

        System.out.println(sw.toString());
    }
}
