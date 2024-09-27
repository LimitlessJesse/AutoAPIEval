import javax.print.attribute.standard.MultipleDocumentHandling;

public class MultipleDocumentHandling_2 {
    public static void main(String[] args) {
        MultipleDocumentHandling handling = new MultipleDocumentHandling(MultipleDocumentHandling.SEPARATE_DOCUMENTS_COLLATED_COPIES);
        String name = handling.getName();
        System.out.println("Document handling type: " + name);
    }
}
