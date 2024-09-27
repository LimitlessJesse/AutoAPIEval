import java.lang.StringBuilder;

public class StringBuilder_15 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello, World!");
        System.out.println("Before trimToSize(): " + sb.capacity());
        sb.trimToSize();
        System.out.println("After trimToSize(): " + sb.capacity());
    }
}
