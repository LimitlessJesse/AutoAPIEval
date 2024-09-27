import javax.activation.MimeType;

public class MimeType_5 {
    public static void main(String[] args) {
        MimeType mimeType = new MimeType("text/plain");
        mimeType.addParameter("charset", "UTF-8");
        System.out.println(mimeType.getParameter("charset")); // Outputs: UTF-8
    }
}
