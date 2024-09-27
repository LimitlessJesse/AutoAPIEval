import javax.accessibility.AccessibleHyperlink;

public class AccessibleHyperlink_4 {
    public static void main(String[] args) {
        AccessibleHyperlink hyperlink = new AccessibleHyperlink() {
            @Override
            public int getStartIndex() {
                // Implement your logic here to return the start index of the link
                return 0;
            }
        };
        
        int startIndex = hyperlink.getStartIndex();
        System.out.println("Start Index: " + startIndex);
    }
}
