import java.io.PrintWriter;

public class PrintWriter_10 {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        char[] chars = {'H', 'e', 'l', 'l', 'o','', 'W', 'o', 'r', 'l', 'd', '!', '\n'};
        pw.println(chars);
    }
}
