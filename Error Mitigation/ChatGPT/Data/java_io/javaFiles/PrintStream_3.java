import java.io.PrintStream;

public class PrintStream_3 {
    public static void main(String[] args) {
        PrintStream ps = new PrintStream(System.out);
        double num = 3.14;
        ps.print(num);
    }
}
