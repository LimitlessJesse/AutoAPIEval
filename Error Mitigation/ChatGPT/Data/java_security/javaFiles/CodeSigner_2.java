import java.security.CodeSigner;
import java.security.cert.CertPath;
import java.util.Date;

public class CodeSigner_2 {
    public static void main(String[] args) {
        CodeSigner codeSigner = new CodeSigner(new CertPath() {
            @Override
            public byte[] getEncoded() {
                return new byte[0];
            }

            @Override
            public String getEncoded(String encoding) {
                return null;
            }

            @Override
            public Iterator<String> getEncodings() {
                return null;
            }
        }, new Date());
        
        System.out.println(codeSigner.toString());
    }
}
