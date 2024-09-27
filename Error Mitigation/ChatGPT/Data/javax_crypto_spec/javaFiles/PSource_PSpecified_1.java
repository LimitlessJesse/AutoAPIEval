import javax.crypto.spec.PSource.PSpecified;

public class PSource_PSpecified_1 {
    public static void main(String[] args) {
        PSpecified pSpecified = new PSpecified(new byte[]{1, 2, 3});
        byte[] value = pSpecified.getValue();
        System.out.println("Value of encoding input P: " + new String(value));
    }
}
