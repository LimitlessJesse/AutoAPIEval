import java.security.CodeSigner;
import java.util.Arrays;

public class CodeSigner_4 {
    public static void main(String[] args) {
        CodeSigner signer1 = new CodeSigner(new Object[]{}, null);
        CodeSigner signer2 = new CodeSigner(new Object[]{}, null);

        boolean result = signer1.equals(signer2);
        System.out.println("Are signers equal? " + result);
    }
}
