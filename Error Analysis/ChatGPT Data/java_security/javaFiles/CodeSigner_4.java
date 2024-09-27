import java.security.CodeSigner;
import java.util.Base64;

public class CodeSigner_4 {
    public static void main(String[] args) {
        CodeSigner codeSigner = new CodeSigner(null, null);
        String codeSignerString = codeSigner.toString();
        System.out.println("CodeSigner details: " + codeSignerString);
    }
}
