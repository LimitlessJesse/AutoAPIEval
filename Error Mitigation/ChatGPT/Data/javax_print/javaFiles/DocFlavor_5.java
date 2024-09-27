import javax.print.DocFlavor;

public class DocFlavor_5 {
    public static void main(String[] args) {
        DocFlavor docFlavor = DocFlavor.BYTE_ARRAY.TEXT_PLAIN_UTF_8;
        String paramName = "charset";
        String parameter = docFlavor.getParameter(paramName);
        System.out.println("Parameter value for " + paramName + ": " + parameter);
    }
}
