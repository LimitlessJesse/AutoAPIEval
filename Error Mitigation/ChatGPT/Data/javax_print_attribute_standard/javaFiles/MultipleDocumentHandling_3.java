import javax.print.attribute.standard.MultipleDocumentHandling;

public class MultipleDocumentHandling_3 {
    public static void main(String[] args) {
        MultipleDocumentHandling multipleDocumentHandling = MultipleDocumentHandling.SINGLE_DOCUMENT;
        Class<? extends Attribute> category = multipleDocumentHandling.getCategory();
        System.out.println("Category: " + category.getName());
    }
}
