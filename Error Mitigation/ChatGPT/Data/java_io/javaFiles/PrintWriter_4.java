import java.io.PrintWriter;

public class PrintWriter_4 {
    public static void main(String[] args) {
        PrintWriter writer = new PrintWriter(System.out);
        char[] buf = {'H', 'e', 'l', 'l', 'o'};
        int off = 0;
        int len = 5;
        
        writer.write(buf, off, len);
        writer.flush();
    }
}
