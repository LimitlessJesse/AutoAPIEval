import javax.print.attribute.URISyntax;

public class URISyntax_3 {
    public static void main(String[] args) {
        URISyntax uri = new URISyntax("http://www.example.com");
        int hashCode = uri.hashCode();
        System.out.println("Hashcode for URI attribute: " + hashCode);
    }
}
