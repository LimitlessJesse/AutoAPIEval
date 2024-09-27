import javax.xml.transform.stax.StAXResult;

public class StAXResult_2 {
    public static void main(String[] args) {
        StAXResult staxResult = new StAXResult();
        try {
            staxResult.setSystemId("http://example.com");
        } catch (UnsupportedOperationException e) {
            System.out.println("UnsupportedOperationException: " + e.getMessage());
        }
    }
}
