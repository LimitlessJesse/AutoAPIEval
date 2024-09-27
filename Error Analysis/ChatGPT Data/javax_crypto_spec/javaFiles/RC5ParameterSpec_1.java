import javax.crypto.spec.RC5ParameterSpec;

public class RC5ParameterSpec_1 {
    public static void main(String[] args) {
        RC5ParameterSpec rc5 = new RC5ParameterSpec(32, 16, 8);
        int wordSize = rc5.getWordSize();
        System.out.println("Word Size: " + wordSize);
    }
}
