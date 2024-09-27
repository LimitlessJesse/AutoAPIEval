import java.io.PrintStream;

public class PrintStream_1 {
    public static void main(String[] args) {
        PrintStream ps = new PrintStream(System.out);
        boolean b = true;
        ps.print(b);
    }
}
