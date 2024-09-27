import javax.xml.parsers.DocumentBuilderFactory;

public class DocumentBuilderFactory_5 {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            boolean isXIncludeAware = factory.isXIncludeAware();
            System.out.println("Is XInclude Aware: " + isXIncludeAware);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
