import java.security.CodeSource;

public class CodeSource_4 {
    public static void main(String[] args) {
        CodeSource codeSource1 = new CodeSource(null, null);
        CodeSource codeSource2 = new CodeSource(null, null);
        
        boolean result = codeSource1.equals(codeSource2);
        System.out.println("Are the CodeSource objects equal? " + result);
    }
}
