import java.security.CodeSource;
import java.security.cert.CodeSigner;

public class CodeSource_2 {
    public static void main(String[] args) {
        CodeSource codeSource = Main.class.getProtectionDomain().getCodeSource();
        CodeSigner[] codeSigners = codeSource.getCodeSigners();
        
        if (codeSigners != null) {
            for (CodeSigner signer : codeSigners) {
                System.out.println("Signer information: " + signer.toString());
            }
        } else {
            System.out.println("No code signers found.");
        }
    }
}
