import javax.print.attribute.standard.MultipleDocumentHandling;

public class MultipleDocumentHandling_4 {
    public static void main(String[] args) {
        MultipleDocumentHandling multipleDocumentHandling = MultipleDocumentHandling.SINGLE_DOCUMENT;
        String categoryName = multipleDocumentHandling.getName();
        System.out.println("Category Name: " + categoryName);
    }
}
