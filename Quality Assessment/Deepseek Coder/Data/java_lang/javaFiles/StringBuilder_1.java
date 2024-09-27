import java.lang.StringBuilder;

public class StringBuilder_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello, World!");
        int length = sb.length();
        System.out.println("The length of the StringBuilder is: " + length);
    }
}
