import java.util.Formatter;

public class Formatter_2 {
    public static void main(String[] args) {
        Formatter formatter = new Formatter(System.out);
        formatter.format("The %s jumped over the %s", "cow", "moon");
        formatter.close();
    }
}
