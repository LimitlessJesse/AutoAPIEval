import java.security.CodeSigner;
import java.util.Arrays;

public class CodeSigner_5 {
    public static void main(String[] args) {
        CodeSigner signer1 = new CodeSigner(new byte[]{1, 2}, new String[]{"Cert1"});
        CodeSigner signer2 = new CodeSigner(new byte[]{1, 2}, new String[]{"Cert1"});

        boolean isEqual = signer1.equals(signer2);
        System.out.println("Are the CodeSigners equal? " + isEqual);
    }
}
