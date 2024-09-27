import javax.print.attribute.standard.PageRanges;

public class PageRanges_3 {
    public static void main(String[] args) {
        PageRanges pageRanges1 = new PageRanges(1, 5);
        PageRanges pageRanges2 = new PageRanges(1, 5);
        
        boolean isEqual = pageRanges1.equals(pageRanges2);
        System.out.println("Are the PageRanges equal? " + isEqual);
    }
}
