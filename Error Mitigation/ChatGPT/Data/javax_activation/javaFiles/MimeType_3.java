import javax.activation.MimeType;

public class MimeType_3 {
    public static void main(String[] args) {
        MimeType mimeType = new MimeType();
        String parameterValue = mimeType.getParameter("name");
        System.out.println("Parameter value: " + parameterValue);
    }
}
