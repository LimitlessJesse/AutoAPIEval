import javax.xml.crypto.OctetStreamData;

public class OctetStreamData_3 {
    public static void main(String[] args) {
        OctetStreamData data = new OctetStreamData(); // Assuming OctetStreamData is properly instantiated
        String mimeType = data.getMimeType();
        System.out.println("MIME Type: " + mimeType);
    }
}
