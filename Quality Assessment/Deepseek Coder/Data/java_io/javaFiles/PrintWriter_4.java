import java.io.PrintWriter;

public class PrintWriter_4 {
    public static void main(String[] args) {
        PrintWriter writer = new PrintWriter(System.out);
        double num = 123.456;
        writer.print(num);
        writer.flush();
    }
}
