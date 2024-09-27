import java.security.CodeSource;

public class CodeSource_3 {
    public static void main(String[] args) {
        CodeSource cs1 = new CodeSource("http://www.example.com", (java.security.cert.Certificate[]) null);
        CodeSource cs2 = new CodeSource("http://www.example.com", (java.security.cert.Certificate[]) null);

        boolean isEqual = cs1.equals(cs2);
        System.out.println("Are CodeSources equal? " + isEqual);
    }
}
