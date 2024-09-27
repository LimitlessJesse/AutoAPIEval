import javax.print.attribute.URISyntax;

public class URISyntax_2 {
    public static void main(String[] args) {
        URISyntax uri1 = new URISyntax("http://example.com");
        URISyntax uri2 = new URISyntax("http://example.com");

        boolean result1 = uri1.equals(uri2);
        System.out.println("Are uri1 and uri2 equivalent? " + result1);

        URISyntax uri3 = new URISyntax("http://different.com");

        boolean result2 = uri1.equals(uri3);
        System.out.println("Are uri1 and uri3 equivalent? " + result2);
    }
}
