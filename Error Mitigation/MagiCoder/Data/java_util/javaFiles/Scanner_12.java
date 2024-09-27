import java.util.Scanner;
import java.util.regex.Pattern;

public class Scanner_12 {
    public static void main(String[] args) {
        String input = "Hello, World! This is a test.";
        Scanner scanner = new Scanner(input);
        scanner.useDelimiter(Pattern.compile("\\s*,\\s*"));

        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }

        scanner.close();
    }
}
