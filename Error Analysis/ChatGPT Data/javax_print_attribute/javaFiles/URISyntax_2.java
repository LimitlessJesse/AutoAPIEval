import javax.print.attribute.URISyntax;

public class URISyntax_2 {
    public static void main(String[] args) {
        URISyntax uri1 = new URISyntax("http://www.example.com");
        URISyntax uri2 = new URISyntax("http://www.example.com");
        
        boolean result = uri1.equals(uri2);
        System.out.println("Are URISyntax objects equal? " + result);
    }
}
