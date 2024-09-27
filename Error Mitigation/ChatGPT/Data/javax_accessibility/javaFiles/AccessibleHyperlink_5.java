import javax.accessibility.AccessibleHyperlink;

public class AccessibleHyperlink_5 {
    public static void main(String[] args) {
        AccessibleHyperlink hyperlink = new AccessibleHyperlink() {
            @Override
            public int getEndIndex() {
                // Implement your logic here
                return 0;
            }
        };
        
        int endIndex = hyperlink.getEndIndex();
        System.out.println("End Index: " + endIndex);
    }
}
