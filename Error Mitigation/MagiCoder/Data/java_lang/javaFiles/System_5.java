import java.io.PrintStream;

public class System_5 {
    public static void main(String[] args) {
        PrintStream oldOut = System.out;
        PrintStream newOut = new PrintStream(System.out) {
            @Override
            public void println(String x) {
                super.println(x.toUpperCase());
            }
        };
        System.setOut(newOut);
        System.out.println("Hello, World!");
        System.setOut(oldOut);
        System.out.println("Hello, World!");
    }
}
