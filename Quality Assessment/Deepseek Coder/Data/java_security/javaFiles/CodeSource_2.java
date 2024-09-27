import java.security.CodeSource;

public class CodeSource_2 {
    public static void main(String[] args) {
        CodeSource cs = CodeSource_2.class.getProtectionDomain().getCodeSource();
        System.out.println(cs.toString());
    }
}
