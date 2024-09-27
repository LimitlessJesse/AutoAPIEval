import javax.print.attribute.standard.CopiesSupported;

public class CopiesSupported_5 {
    public static void main(String[] args) {
        CopiesSupported copiesSupported1 = new CopiesSupported(1);
        CopiesSupported copiesSupported2 = copiesSupported1;

        boolean isSame = copiesSupported1 == copiesSupported2;

        System.out.println("Are the two CopiesSupported objects the same? " + isSame);
    }
}
