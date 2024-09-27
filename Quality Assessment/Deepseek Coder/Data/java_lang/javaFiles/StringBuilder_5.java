import java.lang.StringBuilder;

public class StringBuilder_5 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        sb.delete(6, 11); // Deletes from index 6 to 11 (11 is exclusive)
        System.out.println(sb); // Prints "Hello"
    }
}
